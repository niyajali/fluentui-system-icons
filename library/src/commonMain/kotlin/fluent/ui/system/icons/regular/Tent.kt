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
 * Tent Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a tent & general outdoor event scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tent_24_regular.svg)
 * 
 * @return The [ImageVector] for the Tent icon.
 */
public val FluentIcons.Regular.Tent: ImageVector
    get() {
        if (_tent != null) {
            return _tent!!
        }
        _tent = Builder(name = "Tent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.22f, 2.22f)
                curveTo(11.505f, 1.934f, 11.966f, 1.926f, 12.262f, 2.202f)
                lineTo(14.018f, 3.841f)
                curveTo(15.296f, 5.034f, 16.719f, 6.06f, 18.253f, 6.897f)
                curveTo(18.685f, 7.133f, 18.98f, 7.558f, 19.05f, 8.045f)
                lineTo(20.4f, 17.5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 17.5f, 22.0f, 17.836f, 22.0f, 18.25f)
                curveTo(22.0f, 18.664f, 21.664f, 19.0f, 21.25f, 19.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 19.0f, 2.0f, 18.664f, 2.0f, 18.25f)
                curveTo(2.0f, 17.836f, 2.336f, 17.5f, 2.75f, 17.5f)
                horizontalLineTo(3.6f)
                lineTo(4.955f, 8.009f)
                curveTo(5.02f, 7.555f, 5.287f, 7.153f, 5.681f, 6.917f)
                curveTo(7.078f, 6.078f, 8.368f, 5.072f, 9.52f, 3.919f)
                lineTo(11.22f, 2.22f)
                close()
                moveTo(5.115f, 17.5f)
                horizontalLineTo(7.246f)
                curveTo(8.818f, 15.333f, 10.005f, 12.911f, 10.755f, 10.34f)
                lineTo(11.28f, 8.54f)
                curveTo(11.373f, 8.22f, 11.667f, 8.0f, 12.0f, 8.0f)
                curveTo(12.333f, 8.0f, 12.627f, 8.22f, 12.72f, 8.54f)
                lineTo(13.245f, 10.34f)
                curveTo(13.995f, 12.911f, 15.182f, 15.333f, 16.754f, 17.5f)
                horizontalLineTo(18.885f)
                lineTo(17.565f, 8.257f)
                curveTo(17.562f, 8.239f, 17.551f, 8.223f, 17.535f, 8.214f)
                curveTo(15.89f, 7.317f, 14.365f, 6.216f, 12.995f, 4.938f)
                lineTo(11.768f, 3.793f)
                lineTo(10.581f, 4.98f)
                curveTo(9.342f, 6.219f, 7.955f, 7.302f, 6.452f, 8.203f)
                curveTo(6.446f, 8.207f, 6.441f, 8.214f, 6.44f, 8.222f)
                lineTo(5.115f, 17.5f)
                close()
                moveTo(14.929f, 17.5f)
                curveTo(13.679f, 15.61f, 12.693f, 13.557f, 12.0f, 11.397f)
                curveTo(11.307f, 13.557f, 10.321f, 15.61f, 9.071f, 17.5f)
                horizontalLineTo(14.929f)
                close()
            }
        }
        .build()
        return _tent!!
    }

@Suppress("ObjectPropertyName")
private var _tent: ImageVector? = null

@Preview
@Composable
private fun TentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Tent, contentDescription = "Tent Icon")
    }
}

