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

public val FluentIcons.Regular.ExpandUpRight: ImageVector
    get() {
        if (_ExpandUpRight != null) {
            return _ExpandUpRight!!
        }
        _ExpandUpRight = ImageVector.Builder(
            name = "Regular.ExpandUpRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 4.5f, 11f, 4.164f, 11f, 3.75f)
                curveTo(11f, 3.336f, 10.664f, 3f, 10.25f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(13.75f)
                curveTo(21f, 13.336f, 20.664f, 13f, 20.25f, 13f)
                curveTo(19.836f, 13f, 19.5f, 13.336f, 19.5f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(12f)
                verticalLineTo(14.75f)
                curveTo(12f, 13.231f, 10.769f, 12f, 9.25f, 12f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(4.5f, 13.5f)
                horizontalLineTo(9.25f)
                curveTo(9.94f, 13.5f, 10.5f, 14.06f, 10.5f, 14.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(13.5f)
                close()
                moveTo(13f, 3.75f)
                curveTo(13f, 3.336f, 13.336f, 3f, 13.75f, 3f)
                horizontalLineTo(20.25f)
                curveTo(20.665f, 3f, 21f, 3.336f, 21f, 3.75f)
                verticalLineTo(10.25f)
                curveTo(21f, 10.664f, 20.665f, 11f, 20.25f, 11f)
                curveTo(19.836f, 11f, 19.5f, 10.664f, 19.5f, 10.25f)
                verticalLineTo(5.561f)
                lineTo(14.28f, 10.78f)
                curveTo(13.987f, 11.073f, 13.512f, 11.073f, 13.22f, 10.78f)
                curveTo(12.927f, 10.487f, 12.927f, 10.012f, 13.22f, 9.72f)
                lineTo(18.44f, 4.5f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 4.5f, 13f, 4.164f, 13f, 3.75f)
                close()
            }
        }.build()

        return _ExpandUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ExpandUpRight: ImageVector? = null

@Preview
@Composable
private fun ExpandUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ExpandUpRight, contentDescription = null)
    }
}
