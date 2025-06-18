/**
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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.FoodEgg: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FoodEgg",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.5f, 12.25f)
            curveTo(11.5f, 11.836f, 11.836f, 11.5f, 12.25f, 11.5f)
            curveTo(12.664f, 11.5f, 13f, 11.164f, 13f, 10.75f)
            curveTo(13f, 10.336f, 12.664f, 10f, 12.25f, 10f)
            curveTo(11.007f, 10f, 10f, 11.007f, 10f, 12.25f)
            curveTo(10f, 12.664f, 10.336f, 13f, 10.75f, 13f)
            curveTo(11.164f, 13f, 11.5f, 12.664f, 11.5f, 12.25f)
            close()
            moveTo(13.5f, 2f)
            curveTo(10.382f, 2f, 7.688f, 3.825f, 6.215f, 6.494f)
            curveTo(5.974f, 6.929f, 5.606f, 7.307f, 5.159f, 7.609f)
            curveTo(3.248f, 8.901f, 2f, 11.179f, 2f, 13.75f)
            curveTo(2f, 17.696f, 4.967f, 21f, 8.75f, 21f)
            curveTo(9.074f, 21f, 9.393f, 20.976f, 9.705f, 20.928f)
            curveTo(10.574f, 20.796f, 11.497f, 20.927f, 12.272f, 21.309f)
            curveTo(13.171f, 21.752f, 14.182f, 22f, 15.25f, 22f)
            curveTo(18.978f, 22f, 22f, 18.978f, 22f, 15.25f)
            curveTo(22f, 14.83f, 21.962f, 14.418f, 21.888f, 14.018f)
            curveTo(21.819f, 13.645f, 21.807f, 13.279f, 21.864f, 12.936f)
            curveTo(21.954f, 12.396f, 22f, 11.841f, 22f, 11.275f)
            curveTo(22f, 6.221f, 18.26f, 2f, 13.5f, 2f)
            close()
            moveTo(17.25f, 12.5f)
            curveTo(17.25f, 15.123f, 15.123f, 17.25f, 12.5f, 17.25f)
            curveTo(9.877f, 17.25f, 7.75f, 15.123f, 7.75f, 12.5f)
            curveTo(7.75f, 9.877f, 9.877f, 7.75f, 12.5f, 7.75f)
            curveTo(15.123f, 7.75f, 17.25f, 9.877f, 17.25f, 12.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FoodEggPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FoodEgg, contentDescription = null)
    }
}
