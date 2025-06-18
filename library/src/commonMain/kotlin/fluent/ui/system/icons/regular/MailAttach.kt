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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.MailAttach: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailAttach",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.954f, 4.1f)
            curveTo(18.766f, 3.289f, 20.081f, 3.289f, 20.892f, 4.1f)
            curveTo(21.703f, 4.911f, 21.703f, 6.226f, 20.892f, 7.038f)
            curveTo(20.865f, 7.064f, 20.841f, 7.092f, 20.82f, 7.122f)
            lineTo(16.639f, 11.301f)
            curveTo(16.377f, 11.563f, 15.951f, 11.564f, 15.689f, 11.301f)
            curveTo(15.427f, 11.039f, 15.427f, 10.614f, 15.689f, 10.352f)
            lineTo(19.523f, 6.529f)
            curveTo(19.816f, 6.237f, 19.816f, 5.762f, 19.524f, 5.469f)
            curveTo(19.232f, 5.176f, 18.757f, 5.175f, 18.464f, 5.467f)
            lineTo(14.629f, 9.291f)
            curveTo(13.781f, 10.139f, 13.781f, 11.514f, 14.629f, 12.361f)
            curveTo(15.477f, 13.209f, 16.851f, 13.209f, 17.699f, 12.361f)
            lineTo(22.024f, 8.038f)
            curveTo(22.062f, 7.999f, 22.096f, 7.958f, 22.124f, 7.914f)
            curveTo(23.347f, 6.509f, 23.289f, 4.377f, 21.952f, 3.04f)
            curveTo(20.556f, 1.643f, 18.291f, 1.643f, 16.894f, 3.04f)
            lineTo(13.216f, 6.718f)
            curveTo(12.923f, 7.01f, 12.923f, 7.485f, 13.216f, 7.778f)
            curveTo(13.509f, 8.071f, 13.983f, 8.071f, 14.276f, 7.778f)
            lineTo(17.954f, 4.1f)
            close()
            moveTo(13.082f, 11.576f)
            lineTo(11.996f, 12.148f)
            lineTo(3.499f, 7.676f)
            verticalLineTo(7.248f)
            lineTo(3.505f, 7.104f)
            curveTo(3.578f, 6.205f, 4.331f, 5.498f, 5.249f, 5.498f)
            horizontalLineTo(13.021f)
            lineTo(14.521f, 3.999f)
            horizontalLineTo(5.249f)
            lineTo(5.064f, 4.004f)
            curveTo(3.356f, 4.1f, 2f, 5.515f, 2f, 7.248f)
            verticalLineTo(16.744f)
            lineTo(2.005f, 16.928f)
            curveTo(2.101f, 18.636f, 3.516f, 19.992f, 5.249f, 19.992f)
            horizontalLineTo(18.744f)
            lineTo(18.928f, 19.987f)
            curveTo(20.636f, 19.892f, 21.993f, 18.476f, 21.993f, 16.744f)
            verticalLineTo(9.482f)
            lineTo(20.493f, 10.981f)
            verticalLineTo(16.744f)
            lineTo(20.487f, 16.887f)
            curveTo(20.414f, 17.786f, 19.662f, 18.493f, 18.744f, 18.493f)
            horizontalLineTo(5.249f)
            lineTo(5.105f, 18.487f)
            curveTo(4.206f, 18.414f, 3.499f, 17.661f, 3.499f, 16.744f)
            verticalLineTo(9.371f)
            lineTo(11.647f, 13.659f)
            lineTo(11.743f, 13.701f)
            curveTo(11.939f, 13.771f, 12.158f, 13.757f, 12.345f, 13.659f)
            lineTo(13.772f, 12.908f)
            curveTo(13.429f, 12.514f, 13.199f, 12.056f, 13.082f, 11.576f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailAttachPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailAttach, contentDescription = null)
    }
}
