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
 * MicSync Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used to general microphone audio scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mic_sync_20_filled.svg)
 * 
 * @return The [ImageVector] for the MicSync icon.
 */
public val FluentIcons.Filled.MicSync: ImageVector
    get() {
        if (_micSync != null) {
            return _micSync!!
        }
        _micSync = Builder(name = "MicSync", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 10.0f)
                curveTo(4.5f, 9.724f, 4.276f, 9.5f, 4.0f, 9.5f)
                curveTo(3.724f, 9.5f, 3.5f, 9.724f, 3.5f, 10.0f)
                curveTo(3.5f, 12.869f, 5.697f, 15.225f, 8.5f, 15.478f)
                verticalLineTo(17.5f)
                curveTo(8.5f, 17.776f, 8.724f, 18.0f, 9.0f, 18.0f)
                curveTo(9.276f, 18.0f, 9.5f, 17.776f, 9.5f, 17.5f)
                verticalLineTo(16.795f)
                curveTo(9.179f, 16.096f, 9.0f, 15.319f, 9.0f, 14.5f)
                curveTo(6.515f, 14.5f, 4.5f, 12.485f, 4.5f, 10.0f)
                close()
                moveTo(12.0f, 5.0f)
                verticalLineTo(9.6f)
                curveTo(10.655f, 10.288f, 9.63f, 11.513f, 9.209f, 12.993f)
                curveTo(9.14f, 12.998f, 9.07f, 13.0f, 9.0f, 13.0f)
                curveTo(7.343f, 13.0f, 6.0f, 11.657f, 6.0f, 10.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 3.343f, 7.343f, 2.0f, 9.0f, 2.0f)
                curveTo(10.657f, 2.0f, 12.0f, 3.343f, 12.0f, 5.0f)
                close()
                moveTo(10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                close()
                moveTo(16.5f, 11.5f)
                curveTo(16.776f, 11.5f, 17.0f, 11.724f, 17.0f, 12.0f)
                verticalLineTo(13.5f)
                curveTo(17.0f, 13.776f, 16.776f, 14.0f, 16.5f, 14.0f)
                horizontalLineTo(15.0f)
                curveTo(14.724f, 14.0f, 14.5f, 13.776f, 14.5f, 13.5f)
                curveTo(14.5f, 13.224f, 14.724f, 13.0f, 15.0f, 13.0f)
                horizontalLineTo(15.468f)
                curveTo(15.418f, 12.972f, 15.366f, 12.946f, 15.314f, 12.923f)
                curveTo(15.068f, 12.814f, 14.803f, 12.755f, 14.535f, 12.75f)
                curveTo(14.267f, 12.746f, 14.0f, 12.795f, 13.751f, 12.896f)
                curveTo(13.502f, 12.996f, 13.276f, 13.146f, 13.086f, 13.336f)
                curveTo(12.891f, 13.531f, 12.574f, 13.531f, 12.379f, 13.336f)
                curveTo(12.183f, 13.141f, 12.183f, 12.824f, 12.379f, 12.629f)
                curveTo(12.663f, 12.344f, 13.003f, 12.119f, 13.376f, 11.968f)
                curveTo(13.75f, 11.818f, 14.15f, 11.743f, 14.552f, 11.75f)
                curveTo(14.955f, 11.757f, 15.352f, 11.846f, 15.72f, 12.009f)
                curveTo(15.816f, 12.052f, 15.91f, 12.1f, 16.0f, 12.152f)
                verticalLineTo(12.0f)
                curveTo(16.0f, 11.724f, 16.224f, 11.5f, 16.5f, 11.5f)
                close()
                moveTo(15.624f, 17.032f)
                curveTo(15.25f, 17.183f, 14.85f, 17.257f, 14.448f, 17.25f)
                curveTo(14.045f, 17.243f, 13.648f, 17.154f, 13.28f, 16.991f)
                curveTo(13.184f, 16.948f, 13.09f, 16.9f, 13.0f, 16.848f)
                verticalLineTo(17.0f)
                curveTo(13.0f, 17.276f, 12.776f, 17.5f, 12.5f, 17.5f)
                curveTo(12.224f, 17.5f, 12.0f, 17.276f, 12.0f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(12.0f, 15.224f, 12.224f, 15.0f, 12.5f, 15.0f)
                horizontalLineTo(14.0f)
                curveTo(14.276f, 15.0f, 14.5f, 15.224f, 14.5f, 15.5f)
                curveTo(14.5f, 15.776f, 14.276f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(13.532f)
                curveTo(13.582f, 16.028f, 13.634f, 16.054f, 13.686f, 16.077f)
                curveTo(13.932f, 16.186f, 14.197f, 16.245f, 14.465f, 16.25f)
                curveTo(14.733f, 16.254f, 15.0f, 16.205f, 15.249f, 16.104f)
                curveTo(15.498f, 16.004f, 15.724f, 15.854f, 15.914f, 15.664f)
                curveTo(16.11f, 15.469f, 16.426f, 15.469f, 16.621f, 15.664f)
                curveTo(16.817f, 15.859f, 16.817f, 16.176f, 16.621f, 16.371f)
                curveTo(16.337f, 16.656f, 15.997f, 16.881f, 15.624f, 17.032f)
                close()
            }
        }
        .build()
        return _micSync!!
    }

@Suppress("ObjectPropertyName")
private var _micSync: ImageVector? = null

@Preview
@Composable
private fun MicSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MicSync, contentDescription = "MicSync Icon")
    }
}

