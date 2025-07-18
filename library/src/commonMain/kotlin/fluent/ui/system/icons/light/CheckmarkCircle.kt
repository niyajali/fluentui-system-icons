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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.CheckmarkCircle: ImageVector
    get() {
        if (_CheckmarkCircle != null) {
            return _CheckmarkCircle!!
        }
        _CheckmarkCircle = ImageVector.Builder(
            name = "Light.CheckmarkCircle",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 16f)
                curveTo(3f, 8.82f, 8.82f, 3f, 16f, 3f)
                curveTo(23.18f, 3f, 29f, 8.82f, 29f, 16f)
                curveTo(29f, 23.18f, 23.18f, 29f, 16f, 29f)
                curveTo(8.82f, 29f, 3f, 23.18f, 3f, 16f)
                close()
                moveTo(16f, 2f)
                curveTo(8.268f, 2f, 2f, 8.268f, 2f, 16f)
                curveTo(2f, 23.732f, 8.268f, 30f, 16f, 30f)
                curveTo(23.732f, 30f, 30f, 23.732f, 30f, 16f)
                curveTo(30f, 8.268f, 23.732f, 2f, 16f, 2f)
                close()
                moveTo(22.854f, 12.354f)
                curveTo(23.049f, 12.158f, 23.049f, 11.842f, 22.854f, 11.646f)
                curveTo(22.658f, 11.451f, 22.342f, 11.451f, 22.146f, 11.646f)
                lineTo(14.5f, 19.293f)
                lineTo(10.854f, 15.646f)
                curveTo(10.658f, 15.451f, 10.342f, 15.451f, 10.146f, 15.646f)
                curveTo(9.951f, 15.842f, 9.951f, 16.158f, 10.146f, 16.354f)
                lineTo(14.146f, 20.354f)
                curveTo(14.342f, 20.549f, 14.658f, 20.549f, 14.854f, 20.354f)
                lineTo(22.854f, 12.354f)
                close()
            }
        }.build()

        return _CheckmarkCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CheckmarkCircle: ImageVector? = null

@Preview
@Composable
private fun CheckmarkCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.CheckmarkCircle, contentDescription = null)
    }
}
