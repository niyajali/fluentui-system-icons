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

public val FluentIcons.Filled.CloudArrowUp: ImageVector
    get() {
        if (_CloudArrowUp != null) {
            return _CloudArrowUp!!
        }
        _CloudArrowUp = ImageVector.Builder(
            name = "Filled.CloudArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.08f, 8.019f)
                curveTo(6.548f, 5.172f, 9.02f, 3f, 12f, 3f)
                curveTo(14.98f, 3f, 17.452f, 5.172f, 17.92f, 8.019f)
                curveTo(20.208f, 8.231f, 22f, 10.156f, 22f, 12.5f)
                curveTo(22f, 12.666f, 21.991f, 12.831f, 21.973f, 12.993f)
                curveTo(20.817f, 11.193f, 18.798f, 10f, 16.5f, 10f)
                curveTo(12.91f, 10f, 10f, 12.91f, 10f, 16.5f)
                curveTo(10f, 16.668f, 10.006f, 16.835f, 10.019f, 17f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 17f, 2f, 14.985f, 2f, 12.5f)
                curveTo(2f, 10.156f, 3.792f, 8.231f, 6.08f, 8.019f)
                close()
                moveTo(22f, 16.5f)
                curveTo(22f, 19.538f, 19.538f, 22f, 16.5f, 22f)
                curveTo(13.462f, 22f, 11f, 19.538f, 11f, 16.5f)
                curveTo(11f, 13.462f, 13.462f, 11f, 16.5f, 11f)
                curveTo(19.538f, 11f, 22f, 13.462f, 22f, 16.5f)
                close()
                moveTo(16f, 19.5f)
                curveTo(16f, 19.776f, 16.224f, 20f, 16.5f, 20f)
                curveTo(16.776f, 20f, 17f, 19.776f, 17f, 19.5f)
                verticalLineTo(14.707f)
                lineTo(18.646f, 16.354f)
                curveTo(18.842f, 16.549f, 19.158f, 16.549f, 19.354f, 16.354f)
                curveTo(19.549f, 16.158f, 19.549f, 15.842f, 19.354f, 15.646f)
                lineTo(16.854f, 13.146f)
                curveTo(16.658f, 12.951f, 16.342f, 12.951f, 16.146f, 13.146f)
                lineTo(13.646f, 15.646f)
                curveTo(13.451f, 15.842f, 13.451f, 16.158f, 13.646f, 16.354f)
                curveTo(13.842f, 16.549f, 14.158f, 16.549f, 14.354f, 16.354f)
                lineTo(16f, 14.707f)
                verticalLineTo(19.5f)
                close()
            }
        }.build()

        return _CloudArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _CloudArrowUp: ImageVector? = null

@Preview
@Composable
private fun CloudArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CloudArrowUp, contentDescription = null)
    }
}
