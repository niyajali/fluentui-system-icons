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
 * AlignDistributeBottom Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent aligning distributing bottom.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_align_distribute_bottom_16_filled.svg)
 * 
 * @return The [ImageVector] for the AlignDistributeBottom icon.
 */
public val FluentIcons.Filled.AlignDistributeBottom: ImageVector
    get() {
        if (_alignDistributeBottom != null) {
            return _alignDistributeBottom!!
        }
        _alignDistributeBottom = Builder(name = "AlignDistributeBottom", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 15.0f)
                curveTo(14.776f, 15.0f, 15.0f, 14.776f, 15.0f, 14.5f)
                curveTo(15.0f, 14.224f, 14.776f, 14.0f, 14.5f, 14.0f)
                horizontalLineTo(1.5f)
                curveTo(1.224f, 14.0f, 1.0f, 14.224f, 1.0f, 14.5f)
                curveTo(1.0f, 14.776f, 1.224f, 15.0f, 1.5f, 15.0f)
                lineTo(14.5f, 15.0f)
                close()
                moveTo(14.5f, 8.0f)
                curveTo(14.776f, 8.0f, 15.0f, 7.776f, 15.0f, 7.5f)
                curveTo(15.0f, 7.224f, 14.776f, 7.0f, 14.5f, 7.0f)
                lineTo(1.5f, 7.0f)
                curveTo(1.224f, 7.0f, 1.0f, 7.224f, 1.0f, 7.5f)
                curveTo(1.0f, 7.776f, 1.224f, 8.0f, 1.5f, 8.0f)
                lineTo(14.5f, 8.0f)
                close()
                moveTo(3.0f, 3.5f)
                curveTo(3.0f, 2.672f, 3.672f, 2.0f, 4.5f, 2.0f)
                lineTo(11.5f, 2.0f)
                curveTo(12.328f, 2.0f, 13.0f, 2.672f, 13.0f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(13.0f, 5.328f, 12.328f, 6.0f, 11.5f, 6.0f)
                lineTo(4.5f, 6.0f)
                curveTo(3.672f, 6.0f, 3.0f, 5.328f, 3.0f, 4.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(6.5f, 9.0f)
                curveTo(5.672f, 9.0f, 5.0f, 9.672f, 5.0f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(5.0f, 12.328f, 5.672f, 13.0f, 6.5f, 13.0f)
                horizontalLineTo(9.5f)
                curveTo(10.328f, 13.0f, 11.0f, 12.328f, 11.0f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(11.0f, 9.672f, 10.328f, 9.0f, 9.5f, 9.0f)
                horizontalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _alignDistributeBottom!!
    }

@Suppress("ObjectPropertyName")
private var _alignDistributeBottom: ImageVector? = null

@Preview
@Composable
private fun AlignDistributeBottomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AlignDistributeBottom, contentDescription = "AlignDistributeBottom Icon")
    }
}

