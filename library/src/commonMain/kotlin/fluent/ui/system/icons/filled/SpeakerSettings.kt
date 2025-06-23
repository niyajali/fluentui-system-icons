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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.SpeakerSettings: ImageVector
    get() {
        if (_SpeakerSettings != null) {
            return _SpeakerSettings!!
        }
        _SpeakerSettings = ImageVector.Builder(
            name = "Filled.SpeakerSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.704f, 3.443f)
                curveTo(14.895f, 3.668f, 15f, 3.954f, 15f, 4.25f)
                verticalLineTo(11.5f)
                curveTo(12.651f, 12.479f, 11f, 14.797f, 11f, 17.501f)
                curveTo(11f, 18.113f, 11.085f, 18.705f, 11.243f, 19.266f)
                lineTo(7.975f, 16.5f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 16.5f, 2f, 15.493f, 2f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(2f, 8.507f, 3.007f, 7.5f, 4.25f, 7.5f)
                horizontalLineTo(7.975f)
                lineTo(12.943f, 3.296f)
                curveTo(13.469f, 2.85f, 14.258f, 2.916f, 14.704f, 3.443f)
                close()
                moveTo(14.278f, 13.977f)
                curveTo(14.593f, 15.067f, 13.939f, 16.201f, 12.837f, 16.473f)
                lineTo(12.253f, 16.618f)
                curveTo(12.208f, 16.905f, 12.185f, 17.201f, 12.185f, 17.501f)
                curveTo(12.185f, 17.816f, 12.21f, 18.125f, 12.259f, 18.425f)
                lineTo(12.799f, 18.555f)
                curveTo(13.911f, 18.823f, 14.573f, 19.968f, 14.249f, 21.065f)
                lineTo(14.062f, 21.696f)
                curveTo(14.501f, 22.082f, 15.002f, 22.395f, 15.546f, 22.618f)
                lineTo(16.04f, 22.099f)
                curveTo(16.828f, 21.27f, 18.151f, 21.27f, 18.939f, 22.1f)
                lineTo(19.438f, 22.625f)
                curveTo(19.981f, 22.404f, 20.481f, 22.094f, 20.92f, 21.712f)
                lineTo(20.722f, 21.026f)
                curveTo(20.408f, 19.935f, 21.062f, 18.802f, 22.163f, 18.529f)
                lineTo(22.747f, 18.385f)
                curveTo(22.792f, 18.097f, 22.816f, 17.802f, 22.816f, 17.501f)
                curveTo(22.816f, 17.187f, 22.79f, 16.878f, 22.741f, 16.578f)
                lineTo(22.202f, 16.448f)
                curveTo(21.089f, 16.18f, 20.428f, 15.035f, 20.752f, 13.937f)
                lineTo(20.938f, 13.307f)
                curveTo(20.499f, 12.921f, 19.999f, 12.608f, 19.454f, 12.385f)
                lineTo(18.961f, 12.903f)
                curveTo(18.172f, 13.733f, 16.85f, 13.732f, 16.062f, 12.903f)
                lineTo(15.563f, 12.378f)
                curveTo(15.019f, 12.598f, 14.519f, 12.908f, 14.08f, 13.291f)
                lineTo(14.278f, 13.977f)
                close()
                moveTo(17.5f, 19.001f)
                curveTo(16.699f, 19.001f, 16.05f, 18.33f, 16.05f, 17.501f)
                curveTo(16.05f, 16.673f, 16.699f, 16.001f, 17.5f, 16.001f)
                curveTo(18.301f, 16.001f, 18.95f, 16.673f, 18.95f, 17.501f)
                curveTo(18.95f, 18.33f, 18.301f, 19.001f, 17.5f, 19.001f)
                close()
            }
        }.build()

        return _SpeakerSettings!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerSettings: ImageVector? = null

@Preview
@Composable
private fun SpeakerSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SpeakerSettings, contentDescription = null)
    }
}
