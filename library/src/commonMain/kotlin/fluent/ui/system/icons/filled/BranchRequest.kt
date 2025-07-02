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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * BranchRequest icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: branch, request
 * - Source: ic_fluent_branch_request_20_filled.svg
 * 
 * @return The [ImageVector] for the BranchRequest icon.
 */
public val FluentIcons.Filled.BranchRequest: ImageVector
    get() {
        if (_branchRequest != null) {
            return _branchRequest!!
        }
        _branchRequest = Builder(name = "BranchRequest", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                curveTo(8.0f, 6.486f, 6.919f, 7.72f, 5.5f, 7.959f)
                lineTo(5.5f, 12.042f)
                curveTo(6.919f, 12.28f, 8.0f, 13.514f, 8.0f, 15.0f)
                curveTo(8.0f, 16.657f, 6.657f, 18.0f, 5.0f, 18.0f)
                curveTo(3.343f, 18.0f, 2.0f, 16.657f, 2.0f, 15.0f)
                curveTo(2.0f, 13.514f, 3.081f, 12.28f, 4.5f, 12.042f)
                lineTo(4.5f, 7.959f)
                curveTo(3.081f, 7.72f, 2.0f, 6.486f, 2.0f, 5.0f)
                curveTo(2.0f, 3.343f, 3.343f, 2.0f, 5.0f, 2.0f)
                curveTo(6.657f, 2.0f, 8.0f, 3.343f, 8.0f, 5.0f)
                close()
                moveTo(11.854f, 6.854f)
                curveTo(11.658f, 7.049f, 11.342f, 7.049f, 11.146f, 6.854f)
                lineTo(9.146f, 4.854f)
                curveTo(8.951f, 4.658f, 8.951f, 4.342f, 9.146f, 4.146f)
                lineTo(11.146f, 2.146f)
                curveTo(11.342f, 1.951f, 11.658f, 1.951f, 11.854f, 2.146f)
                curveTo(12.049f, 2.342f, 12.049f, 2.658f, 11.854f, 2.854f)
                lineTo(10.707f, 4.0f)
                horizontalLineTo(12.5f)
                curveTo(14.433f, 4.0f, 16.0f, 5.567f, 16.0f, 7.5f)
                verticalLineTo(12.171f)
                curveTo(17.165f, 12.583f, 18.0f, 13.694f, 18.0f, 15.0f)
                curveTo(18.0f, 16.657f, 16.657f, 18.0f, 15.0f, 18.0f)
                curveTo(13.343f, 18.0f, 12.0f, 16.657f, 12.0f, 15.0f)
                curveTo(12.0f, 13.343f, 13.343f, 12.0f, 15.0f, 12.0f)
                verticalLineTo(7.5f)
                curveTo(15.0f, 6.119f, 13.881f, 5.0f, 12.5f, 5.0f)
                horizontalLineTo(10.707f)
                lineTo(11.854f, 6.146f)
                curveTo(12.049f, 6.342f, 12.049f, 6.658f, 11.854f, 6.854f)
                close()
            }
        }
        .build()
        return _branchRequest!!
    }

@Suppress("ObjectPropertyName")
private var _branchRequest: ImageVector? = null

@Preview
@Composable
private fun BranchRequestPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BranchRequest, contentDescription = null)
    }
}

