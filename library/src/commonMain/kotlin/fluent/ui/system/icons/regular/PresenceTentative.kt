/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.PresenceTentative: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PresenceTentative",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.678f, 0.005f)
            curveTo(5.303f, 0.17f, 0.166f, 5.308f, 0f, 11.683f)
            lineTo(11.678f, 0.005f)
            close()
            moveTo(2.39f, 19.193f)
            curveTo(1.643f, 18.198f, 1.048f, 17.083f, 0.638f, 15.882f)
            lineTo(15.877f, 0.642f)
            curveTo(17.078f, 1.052f, 18.193f, 1.648f, 19.189f, 2.394f)
            lineTo(2.39f, 19.193f)
            close()
            moveTo(23.356f, 8.125f)
            lineTo(8.12f, 23.361f)
            curveTo(6.919f, 22.951f, 5.804f, 22.357f, 4.808f, 21.611f)
            lineTo(21.606f, 4.813f)
            curveTo(22.352f, 5.809f, 22.947f, 6.924f, 23.356f, 8.125f)
            close()
            moveTo(23.992f, 12.326f)
            lineTo(12.322f, 23.996f)
            curveTo(18.69f, 23.826f, 23.822f, 18.695f, 23.992f, 12.326f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PresenceTentativePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PresenceTentative, contentDescription = null)
    }
}
