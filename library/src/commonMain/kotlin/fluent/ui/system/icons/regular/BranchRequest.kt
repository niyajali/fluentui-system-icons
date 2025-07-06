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
 * BranchRequest Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in coding scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_branch_request_20_regular.svg)
 * 
 * @return The [ImageVector] for the BranchRequest icon.
 */
public val FluentIcons.Regular.BranchRequest: ImageVector
    get() {
        if (_branchRequest != null) {
            return _branchRequest!!
        }
        _branchRequest = Builder(name = "BranchRequest", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 7.959f)
                curveTo(6.919f, 7.72f, 8.0f, 6.486f, 8.0f, 5.0f)
                curveTo(8.0f, 3.343f, 6.657f, 2.0f, 5.0f, 2.0f)
                curveTo(3.343f, 2.0f, 2.0f, 3.343f, 2.0f, 5.0f)
                curveTo(2.0f, 6.486f, 3.081f, 7.72f, 4.5f, 7.959f)
                lineTo(4.5f, 12.042f)
                curveTo(3.081f, 12.28f, 2.0f, 13.514f, 2.0f, 15.0f)
                curveTo(2.0f, 16.657f, 3.343f, 18.0f, 5.0f, 18.0f)
                curveTo(6.657f, 18.0f, 8.0f, 16.657f, 8.0f, 15.0f)
                curveTo(8.0f, 13.514f, 6.919f, 12.28f, 5.5f, 12.042f)
                lineTo(5.5f, 7.959f)
                close()
                moveTo(5.0f, 7.0f)
                curveTo(3.895f, 7.0f, 3.0f, 6.105f, 3.0f, 5.0f)
                curveTo(3.0f, 3.895f, 3.895f, 3.0f, 5.0f, 3.0f)
                curveTo(6.105f, 3.0f, 7.0f, 3.895f, 7.0f, 5.0f)
                curveTo(7.0f, 6.105f, 6.105f, 7.0f, 5.0f, 7.0f)
                close()
                moveTo(7.0f, 15.0f)
                curveTo(7.0f, 16.105f, 6.105f, 17.0f, 5.0f, 17.0f)
                curveTo(3.895f, 17.0f, 3.0f, 16.105f, 3.0f, 15.0f)
                curveTo(3.0f, 13.895f, 3.895f, 13.0f, 5.0f, 13.0f)
                curveTo(6.105f, 13.0f, 7.0f, 13.895f, 7.0f, 15.0f)
                close()
                moveTo(11.146f, 6.854f)
                curveTo(11.342f, 7.049f, 11.658f, 7.049f, 11.854f, 6.854f)
                curveTo(12.049f, 6.658f, 12.049f, 6.342f, 11.854f, 6.146f)
                lineTo(10.707f, 5.0f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 5.0f, 15.0f, 6.119f, 15.0f, 7.5f)
                verticalLineTo(12.0f)
                curveTo(13.343f, 12.0f, 12.0f, 13.343f, 12.0f, 15.0f)
                curveTo(12.0f, 16.657f, 13.343f, 18.0f, 15.0f, 18.0f)
                curveTo(16.657f, 18.0f, 18.0f, 16.657f, 18.0f, 15.0f)
                curveTo(18.0f, 13.694f, 17.165f, 12.583f, 16.0f, 12.171f)
                verticalLineTo(7.5f)
                curveTo(16.0f, 5.567f, 14.433f, 4.0f, 12.5f, 4.0f)
                horizontalLineTo(10.707f)
                lineTo(11.854f, 2.854f)
                curveTo(12.049f, 2.658f, 12.049f, 2.342f, 11.854f, 2.146f)
                curveTo(11.658f, 1.951f, 11.342f, 1.951f, 11.146f, 2.146f)
                lineTo(9.146f, 4.146f)
                curveTo(8.951f, 4.342f, 8.951f, 4.658f, 9.146f, 4.854f)
                lineTo(11.146f, 6.854f)
                close()
                moveTo(17.0f, 15.0f)
                curveTo(17.0f, 16.105f, 16.105f, 17.0f, 15.0f, 17.0f)
                curveTo(13.895f, 17.0f, 13.0f, 16.105f, 13.0f, 15.0f)
                curveTo(13.0f, 13.895f, 13.895f, 13.0f, 15.0f, 13.0f)
                curveTo(16.105f, 13.0f, 17.0f, 13.895f, 17.0f, 15.0f)
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
        Image(imageVector = FluentIcons.Regular.BranchRequest, contentDescription = "BranchRequest Icon")
    }
}

