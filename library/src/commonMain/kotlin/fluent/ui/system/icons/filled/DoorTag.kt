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

public val FluentIcons.Filled.DoorTag: ImageVector
    get() {
        if (_DoorTag != null) {
            return _DoorTag!!
        }
        _DoorTag = ImageVector.Builder(
            name = "Filled.DoorTag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 6.5f)
                curveTo(11.511f, 6.5f, 11.076f, 6.732f, 10.799f, 7.101f)
                curveTo(10.052f, 8.095f, 8.642f, 8.295f, 7.648f, 7.548f)
                curveTo(6.655f, 6.802f, 6.455f, 5.392f, 7.201f, 4.398f)
                curveTo(8.292f, 2.946f, 10.036f, 2f, 12f, 2f)
                curveTo(15.314f, 2f, 18f, 4.686f, 18f, 8f)
                verticalLineTo(20f)
                curveTo(18f, 21.105f, 17.105f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(6.895f, 22f, 6f, 21.105f, 6f, 20f)
                verticalLineTo(11.5f)
                curveTo(6f, 10.395f, 6.895f, 9.5f, 8f, 9.5f)
                horizontalLineTo(12f)
                curveTo(12.828f, 9.5f, 13.5f, 8.828f, 13.5f, 8f)
                curveTo(13.5f, 7.172f, 12.828f, 6.5f, 12f, 6.5f)
                close()
                moveTo(9.75f, 17.5f)
                curveTo(9.336f, 17.5f, 9f, 17.836f, 9f, 18.25f)
                curveTo(9f, 18.664f, 9.336f, 19f, 9.75f, 19f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 19f, 15f, 18.664f, 15f, 18.25f)
                curveTo(15f, 17.836f, 14.664f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(9.75f)
                close()
            }
        }.build()

        return _DoorTag!!
    }

@Suppress("ObjectPropertyName")
private var _DoorTag: ImageVector? = null

@Preview
@Composable
private fun DoorTagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DoorTag, contentDescription = null)
    }
}
