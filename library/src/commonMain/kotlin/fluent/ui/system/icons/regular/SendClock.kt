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

public val FluentIcons.Regular.SendClock: ImageVector
    get() {
        if (_SendClock != null) {
            return _SendClock!!
        }
        _SendClock = ImageVector.Builder(
            name = "Regular.SendClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.299f, 3.272f)
                lineTo(5.694f, 12f)
                lineTo(2.299f, 20.728f)
                lineTo(2.269f, 20.824f)
                curveTo(2.117f, 21.426f, 2.751f, 21.962f, 3.334f, 21.671f)
                lineTo(11.008f, 17.833f)
                curveTo(11.003f, 17.723f, 11f, 17.612f, 11f, 17.5f)
                curveTo(11f, 17.013f, 11.054f, 16.539f, 11.155f, 16.083f)
                lineTo(4.402f, 19.459f)
                lineTo(7.011f, 12.749f)
                lineTo(13.063f, 12.75f)
                curveTo(13.454f, 12.384f, 13.891f, 12.066f, 14.363f, 11.806f)
                curveTo(14.278f, 11.486f, 13.986f, 11.25f, 13.639f, 11.25f)
                lineTo(7.011f, 11.249f)
                lineTo(4.402f, 4.54f)
                lineTo(17.326f, 11.002f)
                curveTo(17.384f, 11.001f, 17.442f, 11f, 17.5f, 11f)
                curveTo(19.053f, 11f, 20.479f, 11.545f, 21.597f, 12.454f)
                curveTo(21.865f, 12.101f, 21.777f, 11.551f, 21.334f, 11.329f)
                lineTo(3.334f, 2.329f)
                lineTo(3.241f, 2.29f)
                curveTo(2.655f, 2.083f, 2.063f, 2.664f, 2.299f, 3.272f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(17.5f, 14f)
                curveTo(17.776f, 14f, 18f, 14.224f, 18f, 14.5f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                curveTo(20.276f, 17f, 20.5f, 17.224f, 20.5f, 17.5f)
                curveTo(20.5f, 17.776f, 20.276f, 18f, 20f, 18f)
                horizontalLineTo(17.5f)
                curveTo(17.224f, 18f, 17f, 17.776f, 17f, 17.5f)
                verticalLineTo(14.5f)
                curveTo(17f, 14.224f, 17.224f, 14f, 17.5f, 14f)
                close()
            }
        }.build()

        return _SendClock!!
    }

@Suppress("ObjectPropertyName")
private var _SendClock: ImageVector? = null

@Preview
@Composable
private fun SendClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SendClock, contentDescription = null)
    }
}
