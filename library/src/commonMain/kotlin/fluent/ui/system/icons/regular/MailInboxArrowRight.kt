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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.MailInboxArrowRight: ImageVector
    get() {
        if (_MailInboxArrowRight != null) {
            return _MailInboxArrowRight!!
        }
        _MailInboxArrowRight = ImageVector.Builder(
            name = "Regular.MailInboxArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.499f, 3.999f)
                curveTo(10.301f, 4.473f, 10.158f, 4.976f, 10.077f, 5.499f)
                lineTo(6.25f, 5.5f)
                curveTo(5.332f, 5.5f, 4.579f, 6.207f, 4.506f, 7.106f)
                lineTo(4.5f, 7.25f)
                verticalLineTo(13.999f)
                lineTo(9f, 14f)
                curveTo(9.38f, 14f, 9.693f, 14.282f, 9.743f, 14.648f)
                lineTo(9.75f, 14.75f)
                curveTo(9.75f, 15.993f, 10.757f, 17f, 12f, 17f)
                curveTo(13.191f, 17f, 14.166f, 16.075f, 14.245f, 14.904f)
                lineTo(14.25f, 14.75f)
                curveTo(14.25f, 14.37f, 14.532f, 14.057f, 14.898f, 14.007f)
                lineTo(15f, 14f)
                lineTo(19.5f, 13.999f)
                lineTo(19.501f, 12.267f)
                curveTo(20.052f, 11.98f, 20.557f, 11.616f, 21.001f, 11.19f)
                lineTo(21f, 18.75f)
                curveTo(21f, 20.483f, 19.643f, 21.899f, 17.934f, 21.995f)
                lineTo(17.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(4.517f, 22f, 3.101f, 20.643f, 3.005f, 18.934f)
                lineTo(3f, 18.75f)
                verticalLineTo(7.25f)
                curveTo(3f, 5.517f, 4.356f, 4.101f, 6.066f, 4.005f)
                lineTo(6.25f, 4f)
                lineTo(10.499f, 3.999f)
                close()
                moveTo(19.5f, 15.499f)
                lineTo(15.675f, 15.5f)
                curveTo(15.34f, 17.148f, 13.925f, 18.404f, 12.2f, 18.495f)
                lineTo(12f, 18.5f)
                curveTo(10.186f, 18.5f, 8.672f, 17.212f, 8.325f, 15.5f)
                lineTo(4.5f, 15.499f)
                verticalLineTo(18.75f)
                curveTo(4.5f, 19.668f, 5.207f, 20.421f, 6.106f, 20.494f)
                lineTo(6.25f, 20.5f)
                horizontalLineTo(17.75f)
                curveTo(18.668f, 20.5f, 19.421f, 19.793f, 19.494f, 18.893f)
                lineTo(19.5f, 18.75f)
                verticalLineTo(15.499f)
                close()
                moveTo(16.5f, 1f)
                curveTo(19.538f, 1f, 22f, 3.462f, 22f, 6.5f)
                curveTo(22f, 9.538f, 19.538f, 12f, 16.5f, 12f)
                curveTo(13.462f, 12f, 11f, 9.538f, 11f, 6.5f)
                curveTo(11f, 3.462f, 13.462f, 1f, 16.5f, 1f)
                close()
                moveTo(16.716f, 3.589f)
                lineTo(16.646f, 3.646f)
                lineTo(16.589f, 3.716f)
                curveTo(16.471f, 3.886f, 16.471f, 4.114f, 16.589f, 4.284f)
                lineTo(16.646f, 4.354f)
                lineTo(18.292f, 6f)
                horizontalLineTo(13f)
                lineTo(12.91f, 6.008f)
                curveTo(12.706f, 6.045f, 12.545f, 6.206f, 12.508f, 6.41f)
                lineTo(12.5f, 6.5f)
                lineTo(12.508f, 6.59f)
                curveTo(12.545f, 6.794f, 12.706f, 6.955f, 12.91f, 6.992f)
                lineTo(13f, 7f)
                horizontalLineTo(18.292f)
                lineTo(16.646f, 8.646f)
                lineTo(16.589f, 8.716f)
                curveTo(16.454f, 8.911f, 16.473f, 9.18f, 16.646f, 9.354f)
                curveTo(16.82f, 9.527f, 17.089f, 9.546f, 17.284f, 9.411f)
                lineTo(17.354f, 9.354f)
                lineTo(19.895f, 6.806f)
                lineTo(19.928f, 6.758f)
                lineTo(19.962f, 6.691f)
                lineTo(19.983f, 6.628f)
                lineTo(19.998f, 6.546f)
                lineTo(20f, 6.5f)
                lineTo(19.997f, 6.447f)
                lineTo(19.983f, 6.372f)
                lineTo(19.953f, 6.289f)
                lineTo(19.911f, 6.215f)
                lineTo(19.866f, 6.159f)
                lineTo(17.354f, 3.646f)
                lineTo(17.284f, 3.589f)
                curveTo(17.114f, 3.47f, 16.886f, 3.47f, 16.716f, 3.589f)
                close()
            }
        }.build()

        return _MailInboxArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _MailInboxArrowRight: ImageVector? = null

@Preview
@Composable
private fun MailInboxArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailInboxArrowRight, contentDescription = null)
    }
}
