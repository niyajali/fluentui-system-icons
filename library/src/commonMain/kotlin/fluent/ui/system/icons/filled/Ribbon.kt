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

public val FluentIcons.Filled.Ribbon: ImageVector
    get() {
        if (_Ribbon != null) {
            return _Ribbon!!
        }
        _Ribbon = ImageVector.Builder(
            name = "Filled.Ribbon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.002f, 15.244f)
                lineTo(17.001f, 21.245f)
                curveTo(17.001f, 21.853f, 16.316f, 22.208f, 15.819f, 21.858f)
                lineTo(12.001f, 19.171f)
                lineTo(8.184f, 21.858f)
                curveTo(7.687f, 22.208f, 7.003f, 21.853f, 7.003f, 21.245f)
                lineTo(7.001f, 15.246f)
                curveTo(8.37f, 16.344f, 10.108f, 17f, 12f, 17f)
                curveTo(13.893f, 17f, 15.632f, 16.343f, 17.002f, 15.244f)
                close()
                moveTo(12f, 2f)
                curveTo(15.866f, 2f, 19f, 5.134f, 19f, 9f)
                curveTo(19f, 12.866f, 15.866f, 16f, 12f, 16f)
                curveTo(8.134f, 16f, 5f, 12.866f, 5f, 9f)
                curveTo(5f, 5.134f, 8.134f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _Ribbon!!
    }

@Suppress("ObjectPropertyName")
private var _Ribbon: ImageVector? = null

@Preview
@Composable
private fun RibbonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Ribbon, contentDescription = null)
    }
}
