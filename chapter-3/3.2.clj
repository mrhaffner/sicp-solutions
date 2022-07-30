;; Exercise 3.2
;; Page 304

(defn make-monitored
    [f]
    (let [calls (atom 0)]
        (fn [n]
            (cond
                (= n :how-many-calls?)
                    @calls
                (= n :reset-count)
                    (reset! calls 0)
                :else 
                    (do
                        (swap! calls inc)
                        (f n))))))