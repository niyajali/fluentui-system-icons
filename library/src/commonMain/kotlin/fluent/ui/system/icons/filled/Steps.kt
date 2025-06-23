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

public val FluentIcons.Filled.Steps: ImageVector
    get() {
        if (_Steps != null) {
            return _Steps!!
        }
        _Steps = ImageVector.Builder(
            name = "Filled.Steps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3.375f)
                curveTo(12f, 2.616f, 12.616f, 2f, 13.375f, 2f)
                horizontalLineTo(17.125f)
                curveTo(17.884f, 2f, 18.5f, 2.616f, 18.5f, 3.375f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(3.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(7.125f)
                curveTo(13.5f, 7.884f, 12.884f, 8.5f, 12.125f, 8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(12.125f)
                curveTo(8.5f, 12.884f, 7.884f, 13.5f, 7.125f, 13.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(18.5f)
                horizontalLineTo(3.375f)
                curveTo(2.616f, 18.5f, 2f, 17.884f, 2f, 17.125f)
                verticalLineTo(13.375f)
                curveTo(2f, 12.616f, 2.616f, 12f, 3.375f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(8.375f)
                curveTo(7f, 7.616f, 7.616f, 7f, 8.375f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(3.375f)
                close()
                moveTo(15f, 11.375f)
                curveTo(15f, 10.616f, 15.616f, 10f, 16.375f, 10f)
                horizontalLineTo(20.125f)
                curveTo(20.884f, 10f, 21.5f, 10.616f, 21.5f, 11.375f)
                verticalLineTo(18.25f)
                curveTo(21.5f, 20.045f, 20.045f, 21.5f, 18.25f, 21.5f)
                horizontalLineTo(11.375f)
                curveTo(10.616f, 21.5f, 10f, 20.884f, 10f, 20.125f)
                verticalLineTo(16.375f)
                curveTo(10f, 15.616f, 10.616f, 15f, 11.375f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(11.375f)
                close()
            }
        }.build()

        return _Steps!!
    }

@Suppress("ObjectPropertyName")
private var _Steps: ImageVector? = null

@Preview
@Composable
private fun StepsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Steps, contentDescription = null)
    }
}
