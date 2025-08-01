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

public val FluentIcons.Regular.FullScreenMaximize: ImageVector
    get() {
        if (_FullScreenMaximize != null) {
            return _FullScreenMaximize!!
        }
        _FullScreenMaximize = ImageVector.Builder(
            name = "Regular.FullScreenMaximize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.5f, 5.75f)
                curveTo(4.5f, 5.06f, 5.06f, 4.5f, 5.75f, 4.5f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 4.5f, 8.5f, 4.164f, 8.5f, 3.75f)
                curveTo(8.5f, 3.336f, 8.164f, 3f, 7.75f, 3f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
                verticalLineTo(7.75f)
                curveTo(3f, 8.164f, 3.336f, 8.5f, 3.75f, 8.5f)
                curveTo(4.164f, 8.5f, 4.5f, 8.164f, 4.5f, 7.75f)
                verticalLineTo(5.75f)
                close()
                moveTo(4.5f, 18.25f)
                curveTo(4.5f, 18.94f, 5.06f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 19.5f, 8.5f, 19.836f, 8.5f, 20.25f)
                curveTo(8.5f, 20.664f, 8.164f, 21f, 7.75f, 21f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21f, 3f, 19.769f, 3f, 18.25f)
                verticalLineTo(16.25f)
                curveTo(3f, 15.836f, 3.336f, 15.5f, 3.75f, 15.5f)
                curveTo(4.164f, 15.5f, 4.5f, 15.836f, 4.5f, 16.25f)
                verticalLineTo(18.25f)
                close()
                moveTo(18.25f, 4.5f)
                curveTo(18.94f, 4.5f, 19.5f, 5.06f, 19.5f, 5.75f)
                verticalLineTo(7.75f)
                curveTo(19.5f, 8.164f, 19.836f, 8.5f, 20.25f, 8.5f)
                curveTo(20.664f, 8.5f, 21f, 8.164f, 21f, 7.75f)
                verticalLineTo(5.75f)
                curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 3f, 15.5f, 3.336f, 15.5f, 3.75f)
                curveTo(15.5f, 4.164f, 15.836f, 4.5f, 16.25f, 4.5f)
                horizontalLineTo(18.25f)
                close()
                moveTo(19.5f, 18.25f)
                curveTo(19.5f, 18.94f, 18.94f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 19.5f, 15.5f, 19.836f, 15.5f, 20.25f)
                curveTo(15.5f, 20.664f, 15.836f, 21f, 16.25f, 21f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
                verticalLineTo(16.25f)
                curveTo(21f, 15.836f, 20.664f, 15.5f, 20.25f, 15.5f)
                curveTo(19.836f, 15.5f, 19.5f, 15.836f, 19.5f, 16.25f)
                verticalLineTo(18.25f)
                close()
            }
        }.build()

        return _FullScreenMaximize!!
    }

@Suppress("ObjectPropertyName")
private var _FullScreenMaximize: ImageVector? = null

@Preview
@Composable
private fun FullScreenMaximizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FullScreenMaximize, contentDescription = null)
    }
}
