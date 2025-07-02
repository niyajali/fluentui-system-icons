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
 * DatabasePlugConnected icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: database, plug, connected
 * - Source: ic_fluent_database_plug_connected_20_regular.svg
 * 
 * @return The [ImageVector] for the DatabasePlugConnected icon.
 */
public val FluentIcons.Regular.DatabasePlugConnected: ImageVector
    get() {
        if (_databasePlugConnected != null) {
            return _databasePlugConnected!!
        }
        _databasePlugConnected = Builder(name = "DatabasePlugConnected", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                curveTo(4.0f, 3.993f, 4.875f, 3.245f, 5.9f, 2.777f)
                curveTo(7.198f, 2.237f, 8.594f, 1.973f, 10.0f, 2.0f)
                curveTo(11.406f, 1.973f, 12.802f, 2.237f, 14.1f, 2.777f)
                curveTo(15.125f, 3.245f, 16.0f, 3.993f, 16.0f, 5.0f)
                verticalLineTo(10.109f)
                curveTo(15.689f, 10.133f, 15.384f, 10.206f, 15.095f, 10.326f)
                curveTo(15.063f, 10.339f, 15.031f, 10.353f, 15.0f, 10.367f)
                verticalLineTo(6.7f)
                curveTo(14.719f, 6.906f, 14.418f, 7.082f, 14.1f, 7.225f)
                curveTo(12.802f, 7.764f, 11.406f, 8.028f, 10.0f, 8.0f)
                curveTo(8.594f, 8.027f, 7.198f, 7.762f, 5.9f, 7.223f)
                curveTo(5.582f, 7.081f, 5.281f, 6.906f, 5.0f, 6.7f)
                verticalLineTo(15.0f)
                curveTo(5.0f, 15.374f, 5.356f, 15.875f, 6.318f, 16.313f)
                curveTo(7.485f, 16.792f, 8.739f, 17.026f, 10.0f, 17.0f)
                lineTo(10.021f, 17.0f)
                curveTo(10.033f, 17.054f, 10.046f, 17.108f, 10.06f, 17.161f)
                lineTo(9.3f, 17.925f)
                curveTo(9.28f, 17.945f, 9.261f, 17.965f, 9.242f, 17.986f)
                curveTo(8.095f, 17.923f, 6.965f, 17.665f, 5.9f, 17.223f)
                curveTo(4.875f, 16.755f, 4.0f, 16.007f, 4.0f, 15.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.0f, 5.0f)
                curveTo(5.0f, 5.374f, 5.356f, 5.875f, 6.318f, 6.313f)
                curveTo(7.485f, 6.792f, 8.739f, 7.026f, 10.0f, 7.0f)
                curveTo(11.262f, 7.026f, 12.515f, 6.792f, 13.682f, 6.313f)
                curveTo(14.644f, 5.875f, 15.0f, 5.374f, 15.0f, 5.0f)
                curveTo(15.0f, 4.626f, 14.644f, 4.125f, 13.682f, 3.687f)
                curveTo(12.515f, 3.208f, 11.262f, 2.974f, 10.0f, 3.0f)
                curveTo(8.739f, 2.974f, 7.485f, 3.208f, 6.318f, 3.687f)
                curveTo(5.356f, 4.125f, 5.0f, 4.626f, 5.0f, 5.0f)
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
        Image(imageVector = FluentIcons.Regular.DatabasePlugConnected, contentDescription = null)
    }
}

