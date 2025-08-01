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

public val FluentIcons.Filled.Replay: ImageVector
    get() {
        if (_Replay != null) {
            return _Replay!!
        }
        _Replay = ImageVector.Builder(
            name = "Filled.Replay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.5f, 5.385f)
                curveTo(6.332f, 3.309f, 9.013f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 11.522f, 2.033f, 11.053f, 2.098f, 10.593f)
                curveTo(2.147f, 10.246f, 2.452f, 10f, 2.802f, 10f)
                curveTo(3.278f, 10f, 3.628f, 10.446f, 3.568f, 10.919f)
                curveTo(3.523f, 11.273f, 3.5f, 11.634f, 3.5f, 12f)
                curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
                curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
                curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
                curveTo(9.403f, 3.5f, 7.078f, 4.665f, 5.519f, 6.5f)
                horizontalLineTo(7.25f)
                curveTo(7.664f, 6.5f, 8f, 6.836f, 8f, 7.25f)
                curveTo(8f, 7.664f, 7.664f, 8f, 7.25f, 8f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 8f, 3f, 7.664f, 3f, 7.25f)
                verticalLineTo(3.75f)
                curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
                curveTo(4.164f, 3f, 4.5f, 3.336f, 4.5f, 3.75f)
                verticalLineTo(5.385f)
                close()
                moveTo(11.228f, 8.19f)
                curveTo(10.229f, 7.635f, 9f, 8.358f, 9f, 9.501f)
                verticalLineTo(14.499f)
                curveTo(9f, 15.643f, 10.229f, 16.366f, 11.228f, 15.81f)
                lineTo(15.727f, 13.311f)
                curveTo(16.756f, 12.74f, 16.756f, 11.26f, 15.727f, 10.689f)
                lineTo(11.228f, 8.19f)
                close()
            }
        }.build()

        return _Replay!!
    }

@Suppress("ObjectPropertyName")
private var _Replay: ImageVector? = null

@Preview
@Composable
private fun ReplayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Replay, contentDescription = null)
    }
}
