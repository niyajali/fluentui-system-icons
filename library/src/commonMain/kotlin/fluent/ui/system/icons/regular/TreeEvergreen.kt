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
 * TreeEvergreen Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent nature themed events and topics.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tree_evergreen_20_regular.svg)
 * 
 * @return The [ImageVector] for the TreeEvergreen icon.
 */
public val FluentIcons.Regular.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) {
            return _treeEvergreen!!
        }
        _treeEvergreen = Builder(name = "TreeEvergreen", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.618f, 2.211f)
                curveTo(10.255f, 1.924f, 9.743f, 1.924f, 9.38f, 2.211f)
                lineTo(6.072f, 4.822f)
                curveTo(5.267f, 5.456f, 5.365f, 6.564f, 6.014f, 7.135f)
                lineTo(4.55f, 8.342f)
                curveTo(3.587f, 9.136f, 3.977f, 10.613f, 5.06f, 10.936f)
                lineTo(3.474f, 12.422f)
                curveTo(2.488f, 13.345f, 3.142f, 14.999f, 4.493f, 14.999f)
                horizontalLineTo(7.998f)
                verticalLineTo(16.749f)
                curveTo(7.998f, 17.439f, 8.558f, 17.999f, 9.248f, 17.999f)
                horizontalLineTo(10.748f)
                curveTo(11.438f, 17.999f, 11.998f, 17.439f, 11.998f, 16.749f)
                verticalLineTo(14.999f)
                horizontalLineTo(15.502f)
                curveTo(16.853f, 14.999f, 17.507f, 13.344f, 16.52f, 12.421f)
                lineTo(14.933f, 10.937f)
                curveTo(16.019f, 10.616f, 16.411f, 9.137f, 15.446f, 8.342f)
                lineTo(13.984f, 7.136f)
                curveTo(14.633f, 6.565f, 14.731f, 5.457f, 13.927f, 4.822f)
                lineTo(10.618f, 2.211f)
                close()
                moveTo(10.998f, 14.999f)
                verticalLineTo(16.749f)
                curveTo(10.998f, 16.887f, 10.886f, 16.999f, 10.748f, 16.999f)
                horizontalLineTo(9.248f)
                curveTo(9.11f, 16.999f, 8.998f, 16.887f, 8.998f, 16.749f)
                verticalLineTo(14.999f)
                horizontalLineTo(10.998f)
                close()
                moveTo(9.999f, 2.996f)
                lineTo(13.307f, 5.607f)
                curveTo(13.674f, 5.896f, 13.477f, 6.485f, 13.016f, 6.499f)
                curveTo(12.808f, 6.505f, 12.625f, 6.64f, 12.558f, 6.837f)
                curveTo(12.491f, 7.034f, 12.552f, 7.252f, 12.713f, 7.384f)
                lineTo(14.81f, 9.113f)
                curveTo(15.172f, 9.412f, 14.961f, 9.999f, 14.492f, 9.999f)
                horizontalLineTo(13.734f)
                curveTo(13.528f, 9.999f, 13.344f, 10.125f, 13.269f, 10.315f)
                curveTo(13.193f, 10.506f, 13.242f, 10.724f, 13.392f, 10.864f)
                lineTo(15.837f, 13.151f)
                curveTo(16.161f, 13.455f, 15.946f, 13.999f, 15.502f, 13.999f)
                horizontalLineTo(4.493f)
                curveTo(4.049f, 13.999f, 3.834f, 13.455f, 4.158f, 13.151f)
                lineTo(6.599f, 10.864f)
                curveTo(6.749f, 10.724f, 6.798f, 10.506f, 6.723f, 10.315f)
                curveTo(6.647f, 10.125f, 6.463f, 9.999f, 6.258f, 9.999f)
                horizontalLineTo(5.504f)
                curveTo(5.035f, 9.999f, 4.824f, 9.412f, 5.186f, 9.113f)
                lineTo(7.284f, 7.384f)
                curveTo(7.445f, 7.252f, 7.507f, 7.034f, 7.439f, 6.837f)
                curveTo(7.372f, 6.64f, 7.19f, 6.505f, 6.982f, 6.499f)
                curveTo(6.521f, 6.484f, 6.324f, 5.896f, 6.691f, 5.607f)
                lineTo(9.999f, 2.996f)
                close()
            }
        }
        .build()
        return _treeEvergreen!!
    }

@Suppress("ObjectPropertyName")
private var _treeEvergreen: ImageVector? = null

@Preview
@Composable
private fun TreeEvergreenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TreeEvergreen, contentDescription = "TreeEvergreen Icon")
    }
}

