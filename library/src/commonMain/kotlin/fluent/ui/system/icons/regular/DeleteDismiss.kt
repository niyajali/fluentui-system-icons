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

public val FluentIcons.Regular.DeleteDismiss: ImageVector
    get() {
        if (_DeleteDismiss != null) {
            return _DeleteDismiss!!
        }
        _DeleteDismiss = ImageVector.Builder(
            name = "Regular.DeleteDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14f, 5f)
                curveTo(14f, 3.895f, 13.105f, 3f, 12f, 3f)
                curveTo(10.895f, 3f, 10f, 3.895f, 10f, 5f)
                horizontalLineTo(14f)
                close()
                moveTo(8.5f, 5f)
                curveTo(8.5f, 3.067f, 10.067f, 1.5f, 12f, 1.5f)
                curveTo(13.933f, 1.5f, 15.5f, 3.067f, 15.5f, 5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 5f, 22f, 5.336f, 22f, 5.75f)
                curveTo(22f, 6.164f, 21.664f, 6.5f, 21.25f, 6.5f)
                horizontalLineTo(19.931f)
                lineTo(19.428f, 11.695f)
                curveTo(18.971f, 11.464f, 18.483f, 11.286f, 17.972f, 11.167f)
                lineTo(18.424f, 6.5f)
                horizontalLineTo(5.576f)
                lineTo(6.734f, 18.467f)
                curveTo(6.846f, 19.62f, 7.815f, 20.5f, 8.974f, 20.5f)
                horizontalLineTo(10.732f)
                curveTo(11.019f, 21.051f, 11.383f, 21.556f, 11.81f, 22f)
                horizontalLineTo(8.974f)
                curveTo(7.043f, 22f, 5.427f, 20.533f, 5.241f, 18.611f)
                lineTo(4.069f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 6.5f, 2f, 6.164f, 2f, 5.75f)
                curveTo(2f, 5.336f, 2.336f, 5f, 2.75f, 5f)
                horizontalLineTo(8.5f)
                close()
                moveTo(22f, 17.5f)
                curveTo(22f, 20.538f, 19.538f, 23f, 16.5f, 23f)
                curveTo(13.462f, 23f, 11f, 20.538f, 11f, 17.5f)
                curveTo(11f, 14.462f, 13.462f, 12f, 16.5f, 12f)
                curveTo(19.538f, 12f, 22f, 14.462f, 22f, 17.5f)
                close()
                moveTo(14.854f, 15.146f)
                curveTo(14.658f, 14.951f, 14.342f, 14.951f, 14.146f, 15.146f)
                curveTo(13.951f, 15.342f, 13.951f, 15.658f, 14.146f, 15.854f)
                lineTo(15.793f, 17.5f)
                lineTo(14.146f, 19.146f)
                curveTo(13.951f, 19.342f, 13.951f, 19.658f, 14.146f, 19.854f)
                curveTo(14.342f, 20.049f, 14.658f, 20.049f, 14.854f, 19.854f)
                lineTo(16.5f, 18.207f)
                lineTo(18.146f, 19.854f)
                curveTo(18.342f, 20.049f, 18.658f, 20.049f, 18.854f, 19.854f)
                curveTo(19.049f, 19.658f, 19.049f, 19.342f, 18.854f, 19.146f)
                lineTo(17.207f, 17.5f)
                lineTo(18.854f, 15.854f)
                curveTo(19.049f, 15.658f, 19.049f, 15.342f, 18.854f, 15.146f)
                curveTo(18.658f, 14.951f, 18.342f, 14.951f, 18.146f, 15.146f)
                lineTo(16.5f, 16.793f)
                lineTo(14.854f, 15.146f)
                close()
            }
        }.build()

        return _DeleteDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteDismiss: ImageVector? = null

@Preview
@Composable
private fun DeleteDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DeleteDismiss, contentDescription = null)
    }
}
