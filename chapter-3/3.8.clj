;; Exercise 3.8
;; Page 320

;; define and evaluate left to right
(defn f-outer
    []
    (let [first-call (atom true) first-n (atom 0)]
        (fn [n] 
            (if
                (true? @first-call)
                    (do
                        (reset! first-call false)
                        (reset! first-n n))
                0))))

(def f (f-outer))

(+ (f 0) (f 1))

;; redefine and evaluate right to left
(defn f-outer
    []
    (let [first-call (atom true) first-n (atom 0)]
        (fn [n] 
            (if
                (true? @first-call)
                    (do
                        (reset! first-call false)
                        (reset! first-n n))
                0))))

(def f (f-outer))

(+ (f 1) (f 0))
