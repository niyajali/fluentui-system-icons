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
 * MentionArrowDown Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a mention in UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mention_arrow_down_20_filled.svg)
 * 
 * @return The [ImageVector] for the MentionArrowDown icon.
 */
public val FluentIcons.Filled.MentionArrowDown: ImageVector
    get() {
        if (_mentionArrowDown != null) {
            return _mentionArrowDown!!
        }
        _mentionArrowDown = Builder(name = "MentionArrowDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 5.5f)
                curveTo(10.0f, 7.985f, 7.985f, 10.0f, 5.5f, 10.0f)
                curveTo(3.015f, 10.0f, 1.0f, 7.985f, 1.0f, 5.5f)
                curveTo(1.0f, 3.015f, 3.015f, 1.0f, 5.5f, 1.0f)
                curveTo(7.985f, 1.0f, 10.0f, 3.015f, 10.0f, 5.5f)
                close()
                moveTo(5.146f, 7.853f)
                lineTo(5.149f, 7.856f)
                curveTo(5.196f, 7.903f, 5.251f, 7.938f, 5.309f, 7.962f)
                curveTo(5.367f, 7.986f, 5.43f, 8.0f, 5.497f, 8.0f)
                lineTo(5.5f, 8.0f)
                lineTo(5.503f, 8.0f)
                curveTo(5.57f, 8.0f, 5.633f, 7.986f, 5.691f, 7.962f)
                curveTo(5.75f, 7.938f, 5.806f, 7.901f, 5.854f, 7.854f)
                lineTo(7.854f, 5.854f)
                curveTo(8.049f, 5.658f, 8.049f, 5.342f, 7.854f, 5.146f)
                curveTo(7.658f, 4.951f, 7.342f, 4.951f, 7.146f, 5.146f)
                lineTo(6.0f, 6.293f)
                verticalLineTo(3.5f)
                curveTo(6.0f, 3.224f, 5.776f, 3.0f, 5.5f, 3.0f)
                curveTo(5.224f, 3.0f, 5.0f, 3.224f, 5.0f, 3.5f)
                lineTo(5.0f, 6.293f)
                lineTo(3.854f, 5.146f)
                curveTo(3.658f, 4.951f, 3.342f, 4.951f, 3.146f, 5.146f)
                curveTo(2.951f, 5.342f, 2.951f, 5.658f, 3.146f, 5.854f)
                lineTo(5.146f, 7.853f)
                close()
                moveTo(12.753f, 7.474f)
                curveTo(12.237f, 7.074f, 11.598f, 6.824f, 10.854f, 6.764f)
                curveTo(10.729f, 7.297f, 10.526f, 7.8f, 10.258f, 8.261f)
                curveTo(10.337f, 8.254f, 10.417f, 8.25f, 10.5f, 8.25f)
                curveTo(11.923f, 8.25f, 12.75f, 9.297f, 12.75f, 11.0f)
                curveTo(12.75f, 12.669f, 11.883f, 13.75f, 10.5f, 13.75f)
                curveTo(9.117f, 13.75f, 8.25f, 12.669f, 8.25f, 11.0f)
                curveTo(8.25f, 10.724f, 8.272f, 10.466f, 8.314f, 10.227f)
                curveTo(7.835f, 10.512f, 7.31f, 10.727f, 6.752f, 10.857f)
                curveTo(6.751f, 10.904f, 6.75f, 10.952f, 6.75f, 11.0f)
                curveTo(6.75f, 13.434f, 8.207f, 15.25f, 10.5f, 15.25f)
                curveTo(11.702f, 15.25f, 12.674f, 14.751f, 13.326f, 13.926f)
                curveTo(13.875f, 15.071f, 14.796f, 15.75f, 16.0f, 15.75f)
                curveTo(18.026f, 15.75f, 19.25f, 13.827f, 19.25f, 11.0f)
                curveTo(19.25f, 6.444f, 15.556f, 2.75f, 11.0f, 2.75f)
                curveTo(10.758f, 2.75f, 10.519f, 2.76f, 10.282f, 2.781f)
                curveTo(10.54f, 3.235f, 10.736f, 3.729f, 10.858f, 4.251f)
                curveTo(10.905f, 4.25f, 10.952f, 4.25f, 11.0f, 4.25f)
                curveTo(14.728f, 4.25f, 17.75f, 7.272f, 17.75f, 11.0f)
                curveTo(17.75f, 13.102f, 17.019f, 14.25f, 16.0f, 14.25f)
                curveTo(14.981f, 14.25f, 14.25f, 13.102f, 14.25f, 11.0f)
                verticalLineTo(7.5f)
                lineTo(14.243f, 7.398f)
                curveTo(14.193f, 7.032f, 13.88f, 6.75f, 13.5f, 6.75f)
                curveTo(13.095f, 6.75f, 12.764f, 7.072f, 12.753f, 7.474f)
                close()
                moveTo(2.781f, 10.282f)
                curveTo(3.235f, 10.54f, 3.729f, 10.736f, 4.251f, 10.858f)
                curveTo(4.25f, 10.905f, 4.25f, 10.952f, 4.25f, 11.0f)
                curveTo(4.25f, 14.728f, 7.272f, 17.75f, 11.0f, 17.75f)
                curveTo(11.794f, 17.75f, 12.568f, 17.613f, 13.298f, 17.349f)
                curveTo(13.688f, 17.208f, 14.118f, 17.409f, 14.259f, 17.799f)
                curveTo(14.4f, 18.188f, 14.198f, 18.618f, 13.809f, 18.759f)
                curveTo(12.916f, 19.083f, 11.969f, 19.25f, 11.0f, 19.25f)
                curveTo(6.444f, 19.25f, 2.75f, 15.556f, 2.75f, 11.0f)
                curveTo(2.75f, 10.758f, 2.76f, 10.519f, 2.781f, 10.282f)
                close()
            }
        }
        .build()
        return _mentionArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _mentionArrowDown: ImageVector? = null

@Preview
@Composable
private fun MentionArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MentionArrowDown, contentDescription = "MentionArrowDown Icon")
    }
}

