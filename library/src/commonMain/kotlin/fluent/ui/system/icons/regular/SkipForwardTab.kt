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

public val FluentIcons.Regular.SkipForwardTab: ImageVector
    get() {
        if (_SkipForwardTab != null) {
            return _SkipForwardTab!!
        }
        _SkipForwardTab = ImageVector.Builder(
            name = "Regular.SkipForwardTab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.5f, 3.75f)
                curveTo(21.5f, 3.336f, 21.164f, 3f, 20.75f, 3f)
                curveTo(20.336f, 3f, 20f, 3.336f, 20f, 3.75f)
                verticalLineTo(7.149f)
                curveTo(18.847f, 5.762f, 17.35f, 4.587f, 15.472f, 4.005f)
                curveTo(13.093f, 3.269f, 10.568f, 3.331f, 8.239f, 4.197f)
                curveTo(5.923f, 5.059f, 3.735f, 6.807f, 2.593f, 8.89f)
                curveTo(2.393f, 9.253f, 2.526f, 9.709f, 2.89f, 9.908f)
                curveTo(3.253f, 10.107f, 3.709f, 9.974f, 3.908f, 9.611f)
                curveTo(4.852f, 7.888f, 6.733f, 6.358f, 8.762f, 5.603f)
                curveTo(10.777f, 4.854f, 12.962f, 4.799f, 15.028f, 5.438f)
                curveTo(16.73f, 5.965f, 18.099f, 7.102f, 19.157f, 8.5f)
                horizontalLineTo(15.25f)
                curveTo(14.836f, 8.5f, 14.5f, 8.836f, 14.5f, 9.25f)
                curveTo(14.5f, 9.664f, 14.836f, 10f, 15.25f, 10f)
                horizontalLineTo(20.75f)
                curveTo(21.164f, 10f, 21.5f, 9.664f, 21.5f, 9.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(8f, 14f)
                curveTo(7.724f, 14f, 7.5f, 14.224f, 7.5f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(7.5f, 18.776f, 7.724f, 19f, 8f, 19f)
                horizontalLineTo(16f)
                curveTo(16.276f, 19f, 16.5f, 18.776f, 16.5f, 18.5f)
                verticalLineTo(14.5f)
                curveTo(16.5f, 14.224f, 16.276f, 14f, 16f, 14f)
                horizontalLineTo(8f)
                close()
                moveTo(6f, 14.5f)
                curveTo(6f, 13.395f, 6.895f, 12.5f, 8f, 12.5f)
                horizontalLineTo(16f)
                curveTo(17.105f, 12.5f, 18f, 13.395f, 18f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(18f, 19.605f, 17.105f, 20.5f, 16f, 20.5f)
                horizontalLineTo(8f)
                curveTo(6.895f, 20.5f, 6f, 19.605f, 6f, 18.5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _SkipForwardTab!!
    }

@Suppress("ObjectPropertyName")
private var _SkipForwardTab: ImageVector? = null

@Preview
@Composable
private fun SkipForwardTabPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SkipForwardTab, contentDescription = null)
    }
}
