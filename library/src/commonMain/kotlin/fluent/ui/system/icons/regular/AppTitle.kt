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

public val FluentIcons.Regular.AppTitle: ImageVector
    get() {
        if (_AppTitle != null) {
            return _AppTitle!!
        }
        _AppTitle = ImageVector.Builder(
            name = "Regular.AppTitle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.75f, 20.5f)
                horizontalLineTo(19.25f)
                curveTo(19.664f, 20.5f, 20f, 20.836f, 20f, 21.25f)
                curveTo(20f, 21.63f, 19.718f, 21.944f, 19.352f, 21.993f)
                lineTo(19.25f, 22f)
                horizontalLineTo(4.75f)
                curveTo(4.336f, 22f, 4f, 21.664f, 4f, 21.25f)
                curveTo(4f, 20.87f, 4.282f, 20.556f, 4.648f, 20.507f)
                lineTo(4.75f, 20.5f)
                horizontalLineTo(19.25f)
                horizontalLineTo(4.75f)
                close()
                moveTo(16.25f, 3f)
                curveTo(18.321f, 3f, 20f, 4.679f, 20f, 6.75f)
                verticalLineTo(15.25f)
                curveTo(20f, 17.321f, 18.321f, 19f, 16.25f, 19f)
                horizontalLineTo(7.75f)
                curveTo(5.679f, 19f, 4f, 17.321f, 4f, 15.25f)
                verticalLineTo(6.75f)
                curveTo(4f, 4.679f, 5.679f, 3f, 7.75f, 3f)
                horizontalLineTo(16.25f)
                close()
                moveTo(16.25f, 4.5f)
                horizontalLineTo(7.75f)
                curveTo(6.507f, 4.5f, 5.5f, 5.507f, 5.5f, 6.75f)
                verticalLineTo(15.25f)
                curveTo(5.5f, 16.493f, 6.507f, 17.5f, 7.75f, 17.5f)
                horizontalLineTo(16.25f)
                curveTo(17.493f, 17.5f, 18.5f, 16.493f, 18.5f, 15.25f)
                verticalLineTo(6.75f)
                curveTo(18.5f, 5.507f, 17.493f, 4.5f, 16.25f, 4.5f)
                close()
            }
        }.build()

        return _AppTitle!!
    }

@Suppress("ObjectPropertyName")
private var _AppTitle: ImageVector? = null

@Preview
@Composable
private fun AppTitlePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AppTitle, contentDescription = null)
    }
}
