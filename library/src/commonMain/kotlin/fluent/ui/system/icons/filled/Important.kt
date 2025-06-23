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
package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.Important: ImageVector
    get() {
        if (_Important != null) {
            return _Important!!
        }
        _Important = ImageVector.Builder(
            name = "Filled.Important",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2.002f)
                curveTo(9.86f, 2.002f, 8.125f, 3.737f, 8.125f, 5.877f)
                curveTo(8.125f, 8.796f, 9.332f, 12.429f, 9.938f, 14.076f)
                curveTo(10.261f, 14.954f, 11.097f, 15.5f, 12.002f, 15.5f)
                curveTo(12.906f, 15.5f, 13.741f, 14.957f, 14.065f, 14.081f)
                curveTo(14.67f, 12.441f, 15.876f, 8.827f, 15.876f, 5.877f)
                curveTo(15.876f, 3.737f, 14.141f, 2.002f, 12f, 2.002f)
                close()
                moveTo(12.001f, 17.001f)
                curveTo(10.62f, 17.001f, 9.5f, 18.121f, 9.5f, 19.502f)
                curveTo(9.5f, 20.883f, 10.62f, 22.003f, 12.001f, 22.003f)
                curveTo(13.382f, 22.003f, 14.502f, 20.883f, 14.502f, 19.502f)
                curveTo(14.502f, 18.121f, 13.382f, 17.001f, 12.001f, 17.001f)
                close()
            }
        }.build()

        return _Important!!
    }

@Suppress("ObjectPropertyName")
private var _Important: ImageVector? = null

@Preview
@Composable
private fun ImportantPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Important, contentDescription = null)
    }
}
