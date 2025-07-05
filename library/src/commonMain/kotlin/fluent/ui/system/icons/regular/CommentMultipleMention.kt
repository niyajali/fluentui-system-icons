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
 * CommentMultipleMention Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, edge
 * - Description: Used in commenting scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_comment_multiple_mention_20_regular.svg)
 * 
 * @return The [ImageVector] for the CommentMultipleMention icon.
 */
public val FluentIcons.Regular.CommentMultipleMention: ImageVector
    get() {
        if (_commentMultipleMention != null) {
            return _commentMultipleMention!!
        }
        _commentMultipleMention = Builder(name = "CommentMultipleMention", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.389f, 4.114f)
                curveTo(15.892f, 4.508f, 17.0f, 5.874f, 17.0f, 7.5f)
                verticalLineTo(9.341f)
                curveTo(17.349f, 9.465f, 17.684f, 9.62f, 18.0f, 9.803f)
                verticalLineTo(7.5f)
                curveTo(18.0f, 5.015f, 15.985f, 3.0f, 13.5f, 3.0f)
                horizontalLineTo(6.5f)
                curveTo(5.682f, 3.0f, 4.956f, 3.393f, 4.5f, 4.0f)
                horizontalLineTo(13.5f)
                curveTo(13.621f, 4.0f, 13.74f, 4.006f, 13.858f, 4.018f)
                curveTo(14.04f, 4.037f, 14.217f, 4.069f, 14.389f, 4.114f)
                close()
                moveTo(16.0f, 7.5f)
                verticalLineTo(9.083f)
                curveTo(15.675f, 9.028f, 15.341f, 9.0f, 15.0f, 9.0f)
                verticalLineTo(7.5f)
                curveTo(15.0f, 6.672f, 14.328f, 6.0f, 13.5f, 6.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 6.0f, 3.0f, 6.672f, 3.0f, 7.5f)
                verticalLineTo(13.5f)
                curveTo(3.0f, 14.328f, 3.672f, 15.0f, 4.5f, 15.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 16.995f)
                lineTo(8.73f, 15.0f)
                lineTo(9.0f, 15.0f)
                curveTo(9.0f, 15.341f, 9.028f, 15.675f, 9.083f, 16.0f)
                horizontalLineTo(9.057f)
                lineTo(6.59f, 17.803f)
                curveTo(5.929f, 18.286f, 5.0f, 17.814f, 5.0f, 16.995f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 16.0f, 2.0f, 14.881f, 2.0f, 13.5f)
                verticalLineTo(7.5f)
                curveTo(2.0f, 6.119f, 3.119f, 5.0f, 4.5f, 5.0f)
                horizontalLineTo(13.5f)
                curveTo(14.881f, 5.0f, 16.0f, 6.119f, 16.0f, 7.5f)
                close()
                moveTo(15.0f, 11.0f)
                curveTo(12.791f, 11.0f, 11.0f, 12.791f, 11.0f, 15.0f)
                curveTo(11.0f, 17.209f, 12.791f, 19.0f, 15.0f, 19.0f)
                curveTo(15.468f, 19.0f, 15.917f, 18.92f, 16.333f, 18.772f)
                curveTo(16.594f, 18.681f, 16.879f, 18.817f, 16.971f, 19.077f)
                curveTo(17.063f, 19.338f, 16.927f, 19.623f, 16.667f, 19.715f)
                curveTo(16.145f, 19.9f, 15.583f, 20.0f, 15.0f, 20.0f)
                curveTo(12.239f, 20.0f, 10.0f, 17.761f, 10.0f, 15.0f)
                curveTo(10.0f, 12.239f, 12.239f, 10.0f, 15.0f, 10.0f)
                curveTo(17.761f, 10.0f, 20.0f, 12.239f, 20.0f, 15.0f)
                curveTo(20.0f, 16.455f, 19.099f, 17.437f, 18.027f, 17.494f)
                curveTo(17.497f, 17.522f, 16.972f, 17.313f, 16.589f, 16.867f)
                curveTo(16.534f, 16.802f, 16.482f, 16.733f, 16.433f, 16.66f)
                curveTo(16.031f, 17.168f, 15.44f, 17.5f, 14.75f, 17.5f)
                curveTo(13.447f, 17.5f, 12.5f, 16.316f, 12.5f, 15.0f)
                curveTo(12.5f, 13.684f, 13.447f, 12.5f, 14.75f, 12.5f)
                curveTo(15.226f, 12.5f, 15.654f, 12.658f, 16.006f, 12.922f)
                curveTo(16.043f, 12.683f, 16.25f, 12.5f, 16.5f, 12.5f)
                curveTo(16.776f, 12.5f, 17.0f, 12.724f, 17.0f, 13.0f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 15.619f, 17.164f, 16.001f, 17.348f, 16.215f)
                curveTo(17.528f, 16.425f, 17.753f, 16.507f, 17.973f, 16.496f)
                curveTo(18.401f, 16.473f, 19.0f, 16.045f, 19.0f, 15.0f)
                curveTo(19.0f, 12.791f, 17.209f, 11.0f, 15.0f, 11.0f)
                close()
                moveTo(14.75f, 16.5f)
                curveTo(15.38f, 16.5f, 16.0f, 15.893f, 16.0f, 15.0f)
                curveTo(16.0f, 14.107f, 15.38f, 13.5f, 14.75f, 13.5f)
                curveTo(14.12f, 13.5f, 13.5f, 14.107f, 13.5f, 15.0f)
                curveTo(13.5f, 15.893f, 14.12f, 16.5f, 14.75f, 16.5f)
                close()
            }
        }
        .build()
        return _commentMultipleMention!!
    }

@Suppress("ObjectPropertyName")
private var _commentMultipleMention: ImageVector? = null

@Preview
@Composable
private fun CommentMultipleMentionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CommentMultipleMention, contentDescription = "CommentMultipleMention Icon")
    }
}

