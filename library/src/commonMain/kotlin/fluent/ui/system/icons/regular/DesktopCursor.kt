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

public val FluentIcons.Regular.DesktopCursor: ImageVector
    get() {
        if (_DesktopCursor != null) {
            return _DesktopCursor!!
        }
        _DesktopCursor = ImageVector.Builder(
            name = "Regular.DesktopCursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 22f)
                curveTo(6.336f, 22f, 6f, 21.665f, 6f, 21.25f)
                curveTo(6f, 20.871f, 6.282f, 20.557f, 6.648f, 20.507f)
                lineTo(6.75f, 20.5f)
                lineTo(8.499f, 20.5f)
                verticalLineTo(18.002f)
                lineTo(4.25f, 18.002f)
                curveTo(3.059f, 18.002f, 2.084f, 17.077f, 2.005f, 15.906f)
                lineTo(2f, 15.752f)
                verticalLineTo(5.25f)
                curveTo(2f, 4.059f, 2.925f, 3.084f, 4.096f, 3.005f)
                lineTo(4.25f, 3f)
                horizontalLineTo(19.749f)
                curveTo(20.94f, 3f, 21.914f, 3.925f, 21.994f, 5.096f)
                lineTo(21.999f, 5.25f)
                verticalLineTo(15.752f)
                curveTo(21.999f, 16.124f, 21.909f, 16.475f, 21.749f, 16.784f)
                lineTo(20.499f, 15.398f)
                verticalLineTo(5.25f)
                curveTo(20.499f, 4.87f, 20.217f, 4.557f, 19.851f, 4.507f)
                lineTo(19.749f, 4.5f)
                horizontalLineTo(4.25f)
                curveTo(3.87f, 4.5f, 3.557f, 4.782f, 3.507f, 5.148f)
                lineTo(3.5f, 5.25f)
                verticalLineTo(15.752f)
                curveTo(3.5f, 16.132f, 3.782f, 16.446f, 4.148f, 16.495f)
                lineTo(4.25f, 16.502f)
                horizontalLineTo(14.003f)
                lineTo(14.002f, 18.002f)
                horizontalLineTo(9.998f)
                lineTo(9.999f, 20.5f)
                horizontalLineTo(14.001f)
                lineTo(14f, 22f)
                horizontalLineTo(6.75f)
                close()
                moveTo(15.486f, 12.05f)
                curveTo(15.776f, 11.939f, 16.104f, 12.018f, 16.312f, 12.248f)
                lineTo(22.677f, 19.306f)
                curveTo(22.897f, 19.551f, 22.932f, 19.911f, 22.763f, 20.194f)
                curveTo(22.593f, 20.476f, 22.259f, 20.615f, 21.939f, 20.536f)
                lineTo(18.402f, 19.658f)
                lineTo(16.372f, 22.672f)
                curveTo(16.188f, 22.946f, 15.846f, 23.067f, 15.531f, 22.97f)
                curveTo(15.215f, 22.874f, 15f, 22.583f, 15f, 22.253f)
                lineTo(15.005f, 12.75f)
                curveTo(15.005f, 12.44f, 15.196f, 12.162f, 15.486f, 12.05f)
                close()
            }
        }.build()

        return _DesktopCursor!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopCursor: ImageVector? = null

@Preview
@Composable
private fun DesktopCursorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DesktopCursor, contentDescription = null)
    }
}
