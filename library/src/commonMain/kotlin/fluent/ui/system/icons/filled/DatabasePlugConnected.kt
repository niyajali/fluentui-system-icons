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
 * DatabasePlugConnected icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: database, plug, connected
 * - Source: ic_fluent_database_plug_connected_20_filled.svg
 * 
 * @return The [ImageVector] for the DatabasePlugConnected icon.
 */
public val FluentIcons.Filled.DatabasePlugConnected: ImageVector
    get() {
        if (_databasePlugConnected != null) {
            return _databasePlugConnected!!
        }
        _databasePlugConnected = Builder(name = "DatabasePlugConnected", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                curveTo(13.314f, 8.0f, 16.0f, 6.657f, 16.0f, 5.0f)
                curveTo(16.0f, 3.343f, 13.314f, 2.0f, 10.0f, 2.0f)
                curveTo(6.686f, 2.0f, 4.0f, 3.343f, 4.0f, 5.0f)
                curveTo(4.0f, 6.657f, 6.686f, 8.0f, 10.0f, 8.0f)
                close()
                moveTo(14.69f, 8.016f)
                curveTo(15.159f, 7.781f, 15.617f, 7.482f, 16.0f, 7.12f)
                verticalLineTo(10.109f)
                curveTo(15.689f, 10.133f, 15.384f, 10.206f, 15.095f, 10.326f)
                curveTo(14.733f, 10.476f, 14.403f, 10.697f, 14.127f, 10.975f)
                lineTo(13.527f, 11.575f)
                curveTo(13.156f, 11.946f, 12.947f, 12.45f, 12.947f, 12.975f)
                curveTo(12.947f, 13.014f, 12.948f, 13.053f, 12.951f, 13.092f)
                curveTo(12.911f, 13.089f, 12.872f, 13.088f, 12.832f, 13.088f)
                curveTo(12.307f, 13.088f, 11.803f, 13.297f, 11.432f, 13.668f)
                lineTo(10.832f, 14.268f)
                curveTo(10.46f, 14.64f, 10.193f, 15.103f, 10.057f, 15.611f)
                curveTo(9.922f, 16.119f, 9.923f, 16.653f, 10.06f, 17.161f)
                lineTo(9.3f, 17.925f)
                curveTo(9.283f, 17.942f, 9.267f, 17.959f, 9.251f, 17.977f)
                curveTo(6.291f, 17.792f, 4.0f, 16.53f, 4.0f, 15.0f)
                verticalLineTo(7.12f)
                curveTo(4.383f, 7.482f, 4.841f, 7.781f, 5.31f, 8.016f)
                curveTo(6.562f, 8.642f, 8.222f, 9.0f, 10.0f, 9.0f)
                curveTo(11.778f, 9.0f, 13.438f, 8.642f, 14.69f, 8.016f)
                close()
                moveTo(19.198f, 10.854f)
                curveTo(19.292f, 10.76f, 19.345f, 10.633f, 19.345f, 10.5f)
                curveTo(19.345f, 10.368f, 19.292f, 10.24f, 19.198f, 10.146f)
                curveTo(19.105f, 10.053f, 18.978f, 10.0f, 18.845f, 10.0f)
                curveTo(18.712f, 10.0f, 18.585f, 10.052f, 18.491f, 10.146f)
                lineTo(17.305f, 11.332f)
                curveTo(17.292f, 11.349f, 17.281f, 11.367f, 17.27f, 11.385f)
                curveTo(16.888f, 11.157f, 16.442f, 11.063f, 16.0f, 11.117f)
                curveTo(15.559f, 11.172f, 15.149f, 11.372f, 14.834f, 11.685f)
                lineTo(14.234f, 12.285f)
                curveTo(14.05f, 12.469f, 13.947f, 12.718f, 13.947f, 12.978f)
                curveTo(13.947f, 13.238f, 14.05f, 13.487f, 14.234f, 13.671f)
                lineTo(15.676f, 15.11f)
                curveTo(15.86f, 15.294f, 16.109f, 15.397f, 16.369f, 15.397f)
                curveTo(16.629f, 15.397f, 16.879f, 15.294f, 17.063f, 15.11f)
                lineTo(17.663f, 14.51f)
                curveTo(17.977f, 14.195f, 18.177f, 13.784f, 18.231f, 13.343f)
                curveTo(18.285f, 12.902f, 18.191f, 12.455f, 17.963f, 12.073f)
                curveTo(17.982f, 12.063f, 17.999f, 12.051f, 18.016f, 12.038f)
                lineTo(19.198f, 10.854f)
                close()
                moveTo(13.527f, 14.375f)
                curveTo(13.436f, 14.284f, 13.328f, 14.212f, 13.209f, 14.163f)
                curveTo(13.09f, 14.113f, 12.962f, 14.088f, 12.834f, 14.088f)
                curveTo(12.705f, 14.088f, 12.577f, 14.113f, 12.458f, 14.163f)
                curveTo(12.34f, 14.212f, 12.232f, 14.284f, 12.141f, 14.375f)
                lineTo(11.541f, 14.975f)
                curveTo(11.227f, 15.29f, 11.027f, 15.701f, 10.973f, 16.142f)
                curveTo(10.918f, 16.583f, 11.013f, 17.03f, 11.241f, 17.412f)
                curveTo(11.222f, 17.422f, 11.204f, 17.434f, 11.188f, 17.447f)
                lineTo(10.006f, 18.632f)
                curveTo(9.915f, 18.726f, 9.864f, 18.853f, 9.865f, 18.984f)
                curveTo(9.866f, 19.115f, 9.919f, 19.24f, 10.012f, 19.333f)
                curveTo(10.104f, 19.426f, 10.23f, 19.478f, 10.361f, 19.479f)
                curveTo(10.492f, 19.48f, 10.618f, 19.43f, 10.713f, 19.339f)
                lineTo(11.898f, 18.153f)
                curveTo(11.911f, 18.136f, 11.923f, 18.118f, 11.934f, 18.1f)
                curveTo(12.315f, 18.328f, 12.762f, 18.422f, 13.203f, 18.368f)
                curveTo(13.644f, 18.313f, 14.055f, 18.114f, 14.37f, 17.8f)
                lineTo(14.97f, 17.2f)
                curveTo(15.153f, 17.016f, 15.257f, 16.767f, 15.257f, 16.507f)
                curveTo(15.257f, 16.246f, 15.153f, 15.997f, 14.97f, 15.813f)
                lineTo(13.527f, 14.375f)
                close()
            }
        }
        .build()
        return _databasePlugConnected!!
    }

@Suppress("ObjectPropertyName")
private var _databasePlugConnected: ImageVector? = null

@Preview
@Composable
private fun DatabasePlugConnectedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DatabasePlugConnected, contentDescription = null)
    }
}

