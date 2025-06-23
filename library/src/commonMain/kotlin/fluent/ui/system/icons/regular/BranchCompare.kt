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

public val FluentIcons.Regular.BranchCompare: ImageVector
    get() {
        if (_BranchCompare != null) {
            return _BranchCompare!!
        }
        _BranchCompare = ImageVector.Builder(
            name = "Regular.BranchCompare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 5.5f)
                curveTo(9f, 7.263f, 7.696f, 8.722f, 6f, 8.965f)
                verticalLineTo(15f)
                curveTo(6f, 16.657f, 7.343f, 18f, 9f, 18f)
                horizontalLineTo(11.689f)
                lineTo(10.72f, 17.03f)
                curveTo(10.427f, 16.737f, 10.427f, 16.263f, 10.72f, 15.97f)
                curveTo(11.013f, 15.677f, 11.487f, 15.677f, 11.78f, 15.97f)
                lineTo(14.03f, 18.22f)
                curveTo(14.323f, 18.513f, 14.323f, 18.987f, 14.03f, 19.28f)
                lineTo(11.78f, 21.53f)
                curveTo(11.487f, 21.823f, 11.013f, 21.823f, 10.72f, 21.53f)
                curveTo(10.427f, 21.237f, 10.427f, 20.763f, 10.72f, 20.47f)
                lineTo(11.689f, 19.5f)
                horizontalLineTo(9f)
                curveTo(6.515f, 19.5f, 4.5f, 17.485f, 4.5f, 15f)
                verticalLineTo(8.875f)
                lineTo(4.5f, 8.855f)
                curveTo(3.054f, 8.425f, 2f, 7.086f, 2f, 5.5f)
                curveTo(2f, 3.567f, 3.567f, 2f, 5.5f, 2f)
                curveTo(7.433f, 2f, 9f, 3.567f, 9f, 5.5f)
                close()
                moveTo(7.5f, 5.5f)
                curveTo(7.5f, 4.395f, 6.605f, 3.5f, 5.5f, 3.5f)
                curveTo(4.395f, 3.5f, 3.5f, 4.395f, 3.5f, 5.5f)
                curveTo(3.5f, 6.605f, 4.395f, 7.5f, 5.5f, 7.5f)
                curveTo(6.605f, 7.5f, 7.5f, 6.605f, 7.5f, 5.5f)
                close()
                moveTo(22f, 18.5f)
                curveTo(22f, 20.433f, 20.433f, 22f, 18.5f, 22f)
                curveTo(16.567f, 22f, 15f, 20.433f, 15f, 18.5f)
                curveTo(15f, 16.737f, 16.304f, 15.278f, 18f, 15.035f)
                verticalLineTo(9f)
                curveTo(18f, 7.343f, 16.657f, 6f, 15f, 6f)
                horizontalLineTo(13.061f)
                lineTo(14.03f, 6.97f)
                curveTo(14.323f, 7.263f, 14.323f, 7.737f, 14.03f, 8.03f)
                curveTo(13.737f, 8.323f, 13.263f, 8.323f, 12.97f, 8.03f)
                lineTo(10.72f, 5.78f)
                curveTo(10.427f, 5.487f, 10.427f, 5.013f, 10.72f, 4.72f)
                lineTo(12.97f, 2.47f)
                curveTo(13.263f, 2.177f, 13.737f, 2.177f, 14.03f, 2.47f)
                curveTo(14.323f, 2.763f, 14.323f, 3.237f, 14.03f, 3.53f)
                lineTo(13.061f, 4.5f)
                horizontalLineTo(15f)
                curveTo(17.485f, 4.5f, 19.5f, 6.515f, 19.5f, 9f)
                verticalLineTo(15.125f)
                lineTo(19.5f, 15.145f)
                curveTo(20.946f, 15.575f, 22f, 16.914f, 22f, 18.5f)
                close()
                moveTo(20.5f, 18.5f)
                curveTo(20.5f, 17.395f, 19.605f, 16.5f, 18.5f, 16.5f)
                curveTo(17.395f, 16.5f, 16.5f, 17.395f, 16.5f, 18.5f)
                curveTo(16.5f, 19.605f, 17.395f, 20.5f, 18.5f, 20.5f)
                curveTo(19.605f, 20.5f, 20.5f, 19.605f, 20.5f, 18.5f)
                close()
            }
        }.build()

        return _BranchCompare!!
    }

@Suppress("ObjectPropertyName")
private var _BranchCompare: ImageVector? = null

@Preview
@Composable
private fun BranchComparePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BranchCompare, contentDescription = null)
    }
}
