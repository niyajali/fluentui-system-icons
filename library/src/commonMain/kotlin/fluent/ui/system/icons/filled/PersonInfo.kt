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

public val FluentIcons.Filled.PersonInfo: ImageVector
    get() {
        if (_PersonInfo != null) {
            return _PersonInfo!!
        }
        _PersonInfo = ImageVector.Builder(
            name = "Filled.PersonInfo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 17.5f)
                curveTo(11f, 16.211f, 11.375f, 15.01f, 12.022f, 14f)
                horizontalLineTo(5.253f)
                curveTo(4.011f, 14f, 3.004f, 15.007f, 3.004f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(3.004f, 17.741f, 3.182f, 18.299f, 3.514f, 18.765f)
                curveTo(5.056f, 20.929f, 7.579f, 22.001f, 11f, 22.001f)
                curveTo(11.601f, 22.001f, 12.173f, 21.968f, 12.717f, 21.902f)
                curveTo(11.651f, 20.744f, 11f, 19.198f, 11f, 17.5f)
                close()
                moveTo(11f, 2.005f)
                curveTo(13.762f, 2.005f, 16f, 4.243f, 16f, 7.005f)
                curveTo(16f, 9.766f, 13.762f, 12.005f, 11f, 12.005f)
                curveTo(8.239f, 12.005f, 6f, 9.766f, 6f, 7.005f)
                curveTo(6f, 4.243f, 8.239f, 2.005f, 11f, 2.005f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(13.5f, 17.5f)
                curveTo(13.5f, 19.709f, 15.291f, 21.5f, 17.5f, 21.5f)
                curveTo(19.709f, 21.5f, 21.5f, 19.709f, 21.5f, 17.5f)
                curveTo(21.5f, 15.291f, 19.709f, 13.5f, 17.5f, 13.5f)
                curveTo(15.291f, 13.5f, 13.5f, 15.291f, 13.5f, 17.5f)
                close()
                moveTo(18.5f, 15.5f)
                curveTo(18.5f, 16.052f, 18.052f, 16.5f, 17.5f, 16.5f)
                curveTo(16.948f, 16.5f, 16.5f, 16.052f, 16.5f, 15.5f)
                curveTo(16.5f, 14.948f, 16.948f, 14.5f, 17.5f, 14.5f)
                curveTo(18.052f, 14.5f, 18.5f, 14.948f, 18.5f, 15.5f)
                close()
                moveTo(18.25f, 18f)
                curveTo(18.25f, 17.586f, 17.914f, 17.25f, 17.5f, 17.25f)
                curveTo(17.086f, 17.25f, 16.75f, 17.586f, 16.75f, 18f)
                verticalLineTo(19.75f)
                curveTo(16.75f, 20.164f, 17.086f, 20.5f, 17.5f, 20.5f)
                curveTo(17.914f, 20.5f, 18.25f, 20.164f, 18.25f, 19.75f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _PersonInfo!!
    }

@Suppress("ObjectPropertyName")
private var _PersonInfo: ImageVector? = null

@Preview
@Composable
private fun PersonInfoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonInfo, contentDescription = null)
    }
}
