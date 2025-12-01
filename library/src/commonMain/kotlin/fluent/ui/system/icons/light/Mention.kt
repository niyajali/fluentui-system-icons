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

package fluent.ui.system.icons.light

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
 * Mention Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon, outlook, teams
 * - Description: Used to represent a mention in UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mention_32_light.svg)
 * 
 * @return The [ImageVector] for the Mention icon.
 */
public val FluentIcons.Light.Mention: ImageVector
    get() {
        if (_mention != null) {
            return _mention!!
        }
        _mention = Builder(name = "Mention", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(23.732f, 2.0f, 30.0f, 8.268f, 30.0f, 16.0f)
                curveTo(30.0f, 16.208f, 29.994f, 16.414f, 29.984f, 16.62f)
                curveTo(29.981f, 16.699f, 29.978f, 16.776f, 29.973f, 16.854f)
                curveTo(29.971f, 16.874f, 29.971f, 16.894f, 29.97f, 16.914f)
                curveTo(29.969f, 16.921f, 29.966f, 16.927f, 29.966f, 16.934f)
                curveTo(29.842f, 18.725f, 29.365f, 20.141f, 28.66f, 21.158f)
                curveTo(27.835f, 22.349f, 26.693f, 22.998f, 25.499f, 22.998f)
                curveTo(24.306f, 22.998f, 23.164f, 22.349f, 22.339f, 21.158f)
                curveTo(21.933f, 20.571f, 21.602f, 19.852f, 21.37f, 19.004f)
                curveTo(20.331f, 21.354f, 18.112f, 23.0f, 15.5f, 23.0f)
                curveTo(11.873f, 23.0f, 9.0f, 19.828f, 9.0f, 16.0f)
                curveTo(9.0f, 12.172f, 11.873f, 9.0f, 15.5f, 9.0f)
                curveTo(17.835f, 9.0f, 19.855f, 10.316f, 21.0f, 12.273f)
                verticalLineTo(9.5f)
                curveTo(21.0f, 9.224f, 21.224f, 9.0f, 21.5f, 9.0f)
                curveTo(21.776f, 9.0f, 22.0f, 9.224f, 22.0f, 9.5f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 18.094f, 22.484f, 19.611f, 23.161f, 20.589f)
                curveTo(23.836f, 21.563f, 24.693f, 21.998f, 25.499f, 21.998f)
                curveTo(26.305f, 21.998f, 27.163f, 21.563f, 27.838f, 20.589f)
                curveTo(28.515f, 19.611f, 28.999f, 18.094f, 28.999f, 16.0f)
                curveTo(28.999f, 15.997f, 28.999f, 15.993f, 28.999f, 15.99f)
                curveTo(28.994f, 8.815f, 23.176f, 3.0f, 16.0f, 3.0f)
                curveTo(8.82f, 3.0f, 3.0f, 8.82f, 3.0f, 16.0f)
                curveTo(3.0f, 23.18f, 8.82f, 29.0f, 16.0f, 29.0f)
                curveTo(17.726f, 29.0f, 19.374f, 28.663f, 20.881f, 28.052f)
                curveTo(21.074f, 27.973f, 21.298f, 28.014f, 21.445f, 28.162f)
                curveTo(21.693f, 28.41f, 21.619f, 28.829f, 21.295f, 28.962f)
                curveTo(19.662f, 29.63f, 17.874f, 30.0f, 16.0f, 30.0f)
                curveTo(8.268f, 30.0f, 2.0f, 23.732f, 2.0f, 16.0f)
                curveTo(2.0f, 8.268f, 8.268f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(15.5f, 10.0f)
                curveTo(12.499f, 10.0f, 10.0f, 12.648f, 10.0f, 16.0f)
                curveTo(10.0f, 19.352f, 12.499f, 22.0f, 15.5f, 22.0f)
                curveTo(18.501f, 22.0f, 21.0f, 19.352f, 21.0f, 16.0f)
                curveTo(21.0f, 12.648f, 18.501f, 10.0f, 15.5f, 10.0f)
                close()
            }
        }
        .build()
        return _mention!!
    }

@Suppress("ObjectPropertyName")
private var _mention: ImageVector? = null

@Preview
@Composable
private fun MentionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Mention, contentDescription = "Mention Icon")
    }
}

