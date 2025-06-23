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

public val FluentIcons.Filled.Doctor: ImageVector
    get() {
        if (_Doctor != null) {
            return _Doctor!!
        }
        _Doctor = ImageVector.Builder(
            name = "Filled.Doctor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10f, 3.25f)
                curveTo(9.033f, 3.25f, 8.25f, 4.034f, 8.25f, 5f)
                verticalLineTo(8.25f)
                horizontalLineTo(5f)
                curveTo(4.034f, 8.25f, 3.25f, 9.033f, 3.25f, 10f)
                verticalLineTo(14f)
                curveTo(3.25f, 14.967f, 4.034f, 15.75f, 5f, 15.75f)
                horizontalLineTo(8.25f)
                verticalLineTo(19f)
                curveTo(8.25f, 19.966f, 9.033f, 20.75f, 10f, 20.75f)
                horizontalLineTo(14f)
                curveTo(14.967f, 20.75f, 15.75f, 19.966f, 15.75f, 19f)
                verticalLineTo(15.75f)
                horizontalLineTo(19f)
                curveTo(19.966f, 15.75f, 20.75f, 14.967f, 20.75f, 14f)
                verticalLineTo(10f)
                curveTo(20.75f, 9.033f, 19.966f, 8.25f, 19f, 8.25f)
                horizontalLineTo(15.75f)
                verticalLineTo(5f)
                curveTo(15.75f, 4.034f, 14.967f, 3.25f, 14f, 3.25f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Doctor!!
    }

@Suppress("ObjectPropertyName")
private var _Doctor: ImageVector? = null

@Preview
@Composable
private fun DoctorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Doctor, contentDescription = null)
    }
}
