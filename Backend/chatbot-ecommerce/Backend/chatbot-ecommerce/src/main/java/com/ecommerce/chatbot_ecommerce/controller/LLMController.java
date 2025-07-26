@RestController
@RequestMapping("/api/llm")
public class LLMController {

    private final LLMService llmService;

    public LLMController(LLMService llmService) {
        this.llmService = llmService;
    }

    @PostMapping("/ask")
    public ResponseEntity<String> ask(@RequestBody Map<String, String> body) {
        String userQuestion = body.get("question");
        String answer = llmService.askLLM(userQuestion);
        return ResponseEntity.ok(answer);
    }
}
