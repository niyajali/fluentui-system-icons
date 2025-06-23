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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.FoodEgg: ImageVector
    get() {
        if (_FoodEgg != null) {
            return _FoodEgg!!
        }
        _FoodEgg = ImageVector.Builder(
            name = "Regular.FoodEgg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
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
                moveTo(7f, 12.5f)
                curveTo(7f, 9.462f, 9.462f, 7f, 12.5f, 7f)
                curveTo(15.538f, 7f, 18f, 9.462f, 18f, 12.5f)
                curveTo(18f, 15.538f, 15.538f, 18f, 12.5f, 18f)
                curveTo(9.462f, 18f, 7f, 15.538f, 7f, 12.5f)
                close()
                moveTo(12.5f, 8.5f)
                curveTo(10.291f, 8.5f, 8.5f, 10.291f, 8.5f, 12.5f)
                curveTo(8.5f, 14.709f, 10.291f, 16.5f, 12.5f, 16.5f)
                curveTo(14.709f, 16.5f, 16.5f, 14.709f, 16.5f, 12.5f)
                curveTo(16.5f, 10.291f, 14.709f, 8.5f, 12.5f, 8.5f)
                close()
                moveTo(6.215f, 6.494f)
                curveTo(7.688f, 3.825f, 10.382f, 2f, 13.5f, 2f)
                curveTo(18.26f, 2f, 22f, 6.221f, 22f, 11.275f)
                curveTo(22f, 11.841f, 21.954f, 12.396f, 21.864f, 12.936f)
                curveTo(21.807f, 13.279f, 21.819f, 13.645f, 21.888f, 14.018f)
                curveTo(21.962f, 14.418f, 22f, 14.83f, 22f, 15.25f)
                curveTo(22f, 18.978f, 18.978f, 22f, 15.25f, 22f)
                curveTo(14.182f, 22f, 13.171f, 21.752f, 12.272f, 21.309f)
                curveTo(11.497f, 20.927f, 10.574f, 20.796f, 9.705f, 20.928f)
                curveTo(9.393f, 20.976f, 9.074f, 21f, 8.75f, 21f)
                curveTo(4.967f, 21f, 2f, 17.696f, 2f, 13.75f)
                curveTo(2f, 11.179f, 3.248f, 8.901f, 5.159f, 7.609f)
                curveTo(5.606f, 7.307f, 5.974f, 6.929f, 6.215f, 6.494f)
                close()
                moveTo(13.5f, 3.5f)
                curveTo(10.999f, 3.5f, 8.773f, 4.964f, 7.528f, 7.219f)
                curveTo(7.153f, 7.897f, 6.606f, 8.442f, 5.999f, 8.852f)
                curveTo(4.512f, 9.857f, 3.5f, 11.664f, 3.5f, 13.75f)
                curveTo(3.5f, 16.983f, 5.906f, 19.5f, 8.75f, 19.5f)
                curveTo(8.998f, 19.5f, 9.241f, 19.481f, 9.479f, 19.445f)
                curveTo(10.636f, 19.269f, 11.871f, 19.439f, 12.934f, 19.963f)
                curveTo(13.632f, 20.307f, 14.417f, 20.5f, 15.25f, 20.5f)
                curveTo(18.149f, 20.5f, 20.5f, 18.149f, 20.5f, 15.25f)
                curveTo(20.5f, 14.922f, 20.47f, 14.601f, 20.413f, 14.29f)
                curveTo(20.318f, 13.778f, 20.294f, 13.235f, 20.384f, 12.691f)
                curveTo(20.46f, 12.232f, 20.5f, 11.759f, 20.5f, 11.275f)
                curveTo(20.5f, 6.912f, 17.3f, 3.5f, 13.5f, 3.5f)
                close()
            }
        }.build()

        return _FoodEgg!!
    }

@Suppress("ObjectPropertyName")
private var _FoodEgg: ImageVector? = null

@Preview
@Composable
private fun FoodEggPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FoodEgg, contentDescription = null)
    }
}
