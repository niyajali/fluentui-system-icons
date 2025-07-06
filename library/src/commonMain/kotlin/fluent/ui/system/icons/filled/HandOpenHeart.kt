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
 * HandOpenHeart Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent caring - through charity actions like donation to helpful events.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_hand_open_heart_20_filled.svg)
 * 
 * @return The [ImageVector] for the HandOpenHeart icon.
 */
public val FluentIcons.Filled.HandOpenHeart: ImageVector
    get() {
        if (_handOpenHeart != null) {
            return _handOpenHeart!!
        }
        _handOpenHeart = Builder(name = "HandOpenHeart", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.392f, 10.515f)
                lineTo(10.041f, 6.85f)
                curveTo(10.02f, 6.871f, 9.998f, 6.891f, 9.974f, 6.91f)
                curveTo(9.733f, 7.098f, 9.389f, 7.077f, 9.173f, 6.861f)
                lineTo(5.28f, 2.97f)
                curveTo(4.987f, 2.677f, 4.512f, 2.677f, 4.22f, 2.97f)
                curveTo(3.927f, 3.263f, 3.927f, 3.738f, 4.22f, 4.03f)
                lineTo(8.084f, 7.894f)
                curveTo(8.309f, 8.119f, 8.309f, 8.484f, 8.085f, 8.709f)
                curveTo(7.86f, 8.934f, 7.495f, 8.934f, 7.269f, 8.709f)
                lineTo(3.28f, 4.72f)
                curveTo(2.987f, 4.427f, 2.513f, 4.427f, 2.22f, 4.72f)
                curveTo(1.927f, 5.013f, 1.927f, 5.487f, 2.22f, 5.78f)
                lineTo(6.272f, 9.833f)
                curveTo(6.463f, 10.023f, 6.463f, 10.332f, 6.273f, 10.522f)
                curveTo(6.082f, 10.713f, 5.774f, 10.713f, 5.583f, 10.523f)
                lineTo(3.28f, 8.22f)
                curveTo(2.987f, 7.927f, 2.513f, 7.927f, 2.22f, 8.22f)
                curveTo(1.927f, 8.513f, 1.927f, 8.987f, 2.22f, 9.28f)
                lineTo(6.042f, 13.102f)
                curveTo(5.884f, 13.131f, 5.714f, 13.169f, 5.536f, 13.217f)
                curveTo(4.757f, 13.429f, 3.76f, 13.874f, 3.165f, 14.824f)
                curveTo(2.911f, 15.229f, 2.98f, 15.675f, 3.219f, 15.988f)
                curveTo(3.446f, 16.285f, 3.819f, 16.467f, 4.217f, 16.464f)
                curveTo(6.371f, 16.448f, 8.987f, 16.846f, 11.07f, 17.7f)
                curveTo(12.267f, 18.192f, 13.758f, 18.126f, 14.784f, 17.179f)
                lineTo(16.035f, 16.025f)
                curveTo(16.942f, 15.188f, 17.244f, 13.88f, 16.795f, 12.729f)
                lineTo(15.834f, 10.267f)
                lineTo(15.606f, 10.515f)
                curveTo(15.012f, 11.166f, 13.987f, 11.166f, 13.392f, 10.515f)
                close()
                moveTo(9.723f, 13.946f)
                curveTo(9.476f, 14.07f, 9.176f, 13.969f, 9.053f, 13.722f)
                curveTo(8.929f, 13.475f, 9.03f, 13.175f, 9.277f, 13.052f)
                curveTo(9.88f, 12.751f, 10.738f, 12.616f, 11.582f, 12.757f)
                curveTo(12.438f, 12.9f, 13.324f, 13.334f, 13.916f, 14.223f)
                curveTo(14.069f, 14.452f, 14.007f, 14.763f, 13.777f, 14.916f)
                curveTo(13.548f, 15.069f, 13.237f, 15.007f, 13.084f, 14.777f)
                curveTo(12.676f, 14.166f, 12.062f, 13.851f, 11.418f, 13.743f)
                curveTo(10.762f, 13.634f, 10.12f, 13.748f, 9.723f, 13.946f)
                close()
                moveTo(9.338f, 2.917f)
                curveTo(9.027f, 3.56f, 8.931f, 4.277f, 9.048f, 4.964f)
                lineTo(7.22f, 3.03f)
                curveTo(6.927f, 2.738f, 6.927f, 2.263f, 7.22f, 1.97f)
                curveTo(7.512f, 1.677f, 7.987f, 1.677f, 8.28f, 1.97f)
                curveTo(8.566f, 2.256f, 8.932f, 2.574f, 9.338f, 2.917f)
                close()
                moveTo(14.499f, 3.003f)
                lineTo(13.871f, 2.51f)
                curveTo(12.836f, 1.698f, 11.339f, 1.874f, 10.52f, 2.904f)
                curveTo(9.788f, 3.825f, 9.833f, 5.142f, 10.627f, 6.01f)
                lineTo(14.13f, 9.84f)
                curveTo(14.329f, 10.057f, 14.67f, 10.057f, 14.868f, 9.84f)
                lineTo(18.372f, 6.009f)
                curveTo(19.165f, 5.141f, 19.211f, 3.825f, 18.479f, 2.905f)
                curveTo(17.661f, 1.874f, 16.164f, 1.698f, 15.128f, 2.51f)
                lineTo(14.499f, 3.003f)
                close()
            }
        }
        .build()
        return _handOpenHeart!!
    }

@Suppress("ObjectPropertyName")
private var _handOpenHeart: ImageVector? = null

@Preview
@Composable
private fun HandOpenHeartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HandOpenHeart, contentDescription = "HandOpenHeart Icon")
    }
}

