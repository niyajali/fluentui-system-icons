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

public val FluentIcons.Regular.Alert: ImageVector
    get() {
        if (_Alert != null) {
            return _Alert!!
        }
        _Alert = ImageVector.Builder(
            name = "Regular.Alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 1.996f)
                curveTo(16.05f, 1.996f, 19.357f, 5.191f, 19.496f, 9.245f)
                lineTo(19.5f, 9.496f)
                verticalLineTo(13.593f)
                lineTo(20.88f, 16.749f)
                curveTo(20.949f, 16.907f, 20.985f, 17.077f, 20.985f, 17.25f)
                curveTo(20.985f, 17.94f, 20.425f, 18.5f, 19.735f, 18.5f)
                lineTo(15f, 18.501f)
                curveTo(15f, 20.158f, 13.657f, 21.501f, 12f, 21.501f)
                curveTo(10.402f, 21.501f, 9.096f, 20.252f, 9.005f, 18.678f)
                lineTo(9f, 18.499f)
                lineTo(4.275f, 18.5f)
                curveTo(4.104f, 18.5f, 3.934f, 18.465f, 3.777f, 18.396f)
                curveTo(3.144f, 18.121f, 2.853f, 17.385f, 3.128f, 16.752f)
                lineTo(4.5f, 13.594f)
                verticalLineTo(9.496f)
                curveTo(4.501f, 5.341f, 7.852f, 1.996f, 12f, 1.996f)
                close()
                moveTo(13.5f, 18.499f)
                lineTo(10.5f, 18.501f)
                curveTo(10.5f, 19.33f, 11.172f, 20.001f, 12f, 20.001f)
                curveTo(12.78f, 20.001f, 13.421f, 19.406f, 13.493f, 18.646f)
                lineTo(13.5f, 18.499f)
                close()
                moveTo(12f, 3.496f)
                curveTo(8.68f, 3.496f, 6.001f, 6.17f, 6f, 9.496f)
                verticalLineTo(13.906f)
                lineTo(4.656f, 17f)
                horizontalLineTo(19.353f)
                lineTo(18f, 13.907f)
                lineTo(18f, 9.509f)
                lineTo(17.997f, 9.284f)
                curveTo(17.885f, 6.05f, 15.242f, 3.496f, 12f, 3.496f)
                close()
            }
        }.build()

        return _Alert!!
    }

@Suppress("ObjectPropertyName")
private var _Alert: ImageVector? = null

@Preview
@Composable
private fun AlertPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Alert, contentDescription = null)
    }
}
