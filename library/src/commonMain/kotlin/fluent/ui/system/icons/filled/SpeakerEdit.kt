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

public val FluentIcons.Filled.SpeakerEdit: ImageVector
    get() {
        if (_SpeakerEdit != null) {
            return _SpeakerEdit!!
        }
        _SpeakerEdit = ImageVector.Builder(
            name = "Filled.SpeakerEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.999f, 4.252f)
                verticalLineTo(15.355f)
                lineTo(12.489f, 17.864f)
                curveTo(12.045f, 18.309f, 11.722f, 18.859f, 11.55f, 19.462f)
                lineTo(8.427f, 16.686f)
                curveTo(8.29f, 16.563f, 8.113f, 16.496f, 7.929f, 16.496f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 16.496f, 2f, 15.489f, 2f, 14.247f)
                verticalLineTo(9.75f)
                curveTo(2f, 8.507f, 3.007f, 7.5f, 4.25f, 7.5f)
                horizontalLineTo(7.929f)
                curveTo(8.113f, 7.5f, 8.29f, 7.433f, 8.427f, 7.311f)
                lineTo(12.918f, 3.318f)
                curveTo(13.725f, 2.602f, 14.999f, 3.174f, 14.999f, 4.252f)
                close()
                moveTo(18.391f, 11.963f)
                curveTo(18.573f, 11.781f, 18.771f, 11.625f, 18.98f, 11.495f)
                curveTo(18.908f, 10.48f, 18.619f, 9.523f, 18.158f, 8.673f)
                curveTo(17.961f, 8.309f, 17.506f, 8.173f, 17.142f, 8.371f)
                curveTo(16.777f, 8.568f, 16.642f, 9.023f, 16.839f, 9.387f)
                curveTo(17.26f, 10.164f, 17.499f, 11.053f, 17.499f, 12.001f)
                curveTo(17.499f, 12.319f, 17.472f, 12.631f, 17.42f, 12.934f)
                lineTo(18.391f, 11.963f)
                close()
                moveTo(20.442f, 11.012f)
                curveTo(20.959f, 10.969f, 21.484f, 11.048f, 21.971f, 11.249f)
                curveTo(21.826f, 9.313f, 21.13f, 7.529f, 20.039f, 6.055f)
                curveTo(19.793f, 5.723f, 19.323f, 5.653f, 18.99f, 5.899f)
                curveTo(18.657f, 6.146f, 18.587f, 6.615f, 18.834f, 6.948f)
                curveTo(19.695f, 8.111f, 20.267f, 9.5f, 20.442f, 11.012f)
                close()
                moveTo(19.098f, 12.67f)
                lineTo(13.196f, 18.571f)
                curveTo(12.852f, 18.915f, 12.608f, 19.346f, 12.49f, 19.818f)
                lineTo(12.033f, 21.649f)
                curveTo(11.834f, 22.445f, 12.555f, 23.166f, 13.351f, 22.967f)
                lineTo(15.181f, 22.509f)
                curveTo(15.653f, 22.391f, 16.085f, 22.147f, 16.429f, 21.803f)
                lineTo(22.331f, 15.902f)
                curveTo(23.223f, 15.009f, 23.223f, 13.562f, 22.331f, 12.67f)
                curveTo(21.438f, 11.777f, 19.991f, 11.777f, 19.098f, 12.67f)
                close()
            }
        }.build()

        return _SpeakerEdit!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerEdit: ImageVector? = null

@Preview
@Composable
private fun SpeakerEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SpeakerEdit, contentDescription = null)
    }
}
