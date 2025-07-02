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
 * ArrowSyncOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: arrow, sync, off
 * - Source: ic_fluent_arrow_sync_off_20_regular.svg
 * 
 * @return The [ImageVector] for the ArrowSyncOff icon.
 */
public val FluentIcons.Regular.ArrowSyncOff: ImageVector
    get() {
        if (_arrowSyncOff != null) {
            return _arrowSyncOff!!
        }
        _arrowSyncOff = Builder(name = "ArrowSyncOff", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.414f, 3.635f)
                curveTo(11.609f, 3.44f, 11.609f, 3.123f, 11.414f, 2.928f)
                lineTo(9.293f, 0.807f)
                curveTo(9.098f, 0.611f, 8.781f, 0.611f, 8.586f, 0.807f)
                curveTo(8.391f, 1.002f, 8.391f, 1.318f, 8.586f, 1.514f)
                lineTo(9.583f, 2.511f)
                curveTo(8.281f, 2.583f, 6.993f, 2.993f, 5.864f, 3.741f)
                lineTo(6.587f, 4.465f)
                curveTo(7.649f, 3.809f, 8.859f, 3.487f, 10.066f, 3.499f)
                curveTo(10.092f, 3.5f, 10.116f, 3.498f, 10.14f, 3.495f)
                lineTo(8.586f, 5.049f)
                curveTo(8.391f, 5.245f, 8.391f, 5.561f, 8.586f, 5.756f)
                curveTo(8.781f, 5.952f, 9.098f, 5.952f, 9.293f, 5.756f)
                lineTo(11.414f, 3.635f)
                close()
                moveTo(4.355f, 5.061f)
                curveTo(1.773f, 8.007f, 1.887f, 12.492f, 4.697f, 15.302f)
                curveTo(4.954f, 15.559f, 5.225f, 15.794f, 5.508f, 16.006f)
                curveTo(5.729f, 16.171f, 6.042f, 16.127f, 6.208f, 15.906f)
                curveTo(6.373f, 15.685f, 6.328f, 15.371f, 6.107f, 15.206f)
                curveTo(5.862f, 15.022f, 5.627f, 14.818f, 5.404f, 14.595f)
                curveTo(2.984f, 12.176f, 2.871f, 8.324f, 5.064f, 5.77f)
                lineTo(14.229f, 14.935f)
                curveTo(12.997f, 15.993f, 11.464f, 16.514f, 9.934f, 16.499f)
                curveTo(9.908f, 16.498f, 9.884f, 16.5f, 9.86f, 16.503f)
                lineTo(11.414f, 14.949f)
                curveTo(11.609f, 14.753f, 11.609f, 14.437f, 11.414f, 14.242f)
                curveTo(11.219f, 14.046f, 10.902f, 14.046f, 10.707f, 14.242f)
                lineTo(8.586f, 16.363f)
                curveTo(8.391f, 16.558f, 8.391f, 16.875f, 8.586f, 17.07f)
                lineTo(10.707f, 19.191f)
                curveTo(10.902f, 19.387f, 11.219f, 19.387f, 11.414f, 19.191f)
                curveTo(11.609f, 18.996f, 11.609f, 18.68f, 11.414f, 18.484f)
                lineTo(10.417f, 17.487f)
                curveTo(12.039f, 17.397f, 13.639f, 16.783f, 14.938f, 15.644f)
                lineTo(17.146f, 17.853f)
                curveTo(17.342f, 18.048f, 17.658f, 18.048f, 17.854f, 17.853f)
                curveTo(18.049f, 17.657f, 18.049f, 17.341f, 17.854f, 17.146f)
                lineTo(2.854f, 2.145f)
                curveTo(2.658f, 1.95f, 2.342f, 1.95f, 2.146f, 2.145f)
                curveTo(1.951f, 2.341f, 1.951f, 2.657f, 2.146f, 2.853f)
                lineTo(4.355f, 5.061f)
                close()
                moveTo(15.303f, 4.696f)
                curveTo(17.869f, 7.261f, 18.187f, 11.224f, 16.258f, 14.136f)
                lineTo(15.534f, 13.411f)
                curveTo(17.082f, 10.906f, 16.77f, 7.576f, 14.596f, 5.403f)
                curveTo(14.373f, 5.18f, 14.138f, 4.976f, 13.893f, 4.792f)
                curveTo(13.672f, 4.627f, 13.627f, 4.313f, 13.792f, 4.092f)
                curveTo(13.958f, 3.871f, 14.271f, 3.827f, 14.492f, 3.992f)
                curveTo(14.775f, 4.204f, 15.046f, 4.439f, 15.303f, 4.696f)
                close()
            }
        }
        .build()
        return _arrowSyncOff!!
    }

@Suppress("ObjectPropertyName")
private var _arrowSyncOff: ImageVector? = null

@Preview
@Composable
private fun ArrowSyncOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowSyncOff, contentDescription = null)
    }
}

