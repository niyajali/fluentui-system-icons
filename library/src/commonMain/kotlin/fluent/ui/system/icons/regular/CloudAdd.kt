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

public val FluentIcons.Regular.CloudAdd: ImageVector
    get() {
        if (_CloudAdd != null) {
            return _CloudAdd!!
        }
        _CloudAdd = ImageVector.Builder(
            name = "Regular.CloudAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 4.5f)
                curveTo(9.587f, 4.5f, 7.617f, 6.4f, 7.505f, 8.785f)
                curveTo(7.486f, 9.185f, 7.156f, 9.5f, 6.756f, 9.5f)
                horizontalLineTo(6.5f)
                curveTo(4.843f, 9.5f, 3.5f, 10.843f, 3.5f, 12.5f)
                curveTo(3.5f, 14.157f, 4.843f, 15.5f, 6.5f, 15.5f)
                horizontalLineTo(10.076f)
                curveTo(10.026f, 15.826f, 10f, 16.16f, 10f, 16.5f)
                curveTo(10f, 16.668f, 10.006f, 16.835f, 10.019f, 17f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 17f, 2f, 14.985f, 2f, 12.5f)
                curveTo(2f, 10.156f, 3.792f, 8.231f, 6.08f, 8.019f)
                curveTo(6.548f, 5.172f, 9.02f, 3f, 12f, 3f)
                curveTo(14.98f, 3f, 17.452f, 5.172f, 17.92f, 8.019f)
                curveTo(20.208f, 8.231f, 22f, 10.156f, 22f, 12.5f)
                curveTo(22f, 12.666f, 21.991f, 12.831f, 21.973f, 12.993f)
                curveTo(21.503f, 12.26f, 20.89f, 11.628f, 20.173f, 11.137f)
                curveTo(19.676f, 10.165f, 18.666f, 9.5f, 17.5f, 9.5f)
                horizontalLineTo(17.244f)
                curveTo(16.844f, 9.5f, 16.514f, 9.185f, 16.495f, 8.785f)
                curveTo(16.383f, 6.4f, 14.413f, 4.5f, 12f, 4.5f)
                close()
                moveTo(22f, 16.5f)
                curveTo(22f, 13.462f, 19.538f, 11f, 16.5f, 11f)
                curveTo(13.462f, 11f, 11f, 13.462f, 11f, 16.5f)
                curveTo(11f, 19.538f, 13.462f, 22f, 16.5f, 22f)
                curveTo(19.538f, 22f, 22f, 19.538f, 22f, 16.5f)
                close()
                moveTo(17.001f, 17f)
                lineTo(17.001f, 19.503f)
                curveTo(17.001f, 19.78f, 16.777f, 20.003f, 16.501f, 20.003f)
                curveTo(16.225f, 20.003f, 16.001f, 19.78f, 16.001f, 19.503f)
                lineTo(16.001f, 17f)
                horizontalLineTo(13.496f)
                curveTo(13.22f, 17f, 12.996f, 16.776f, 12.996f, 16.5f)
                curveTo(12.996f, 16.224f, 13.22f, 16f, 13.496f, 16f)
                horizontalLineTo(16f)
                lineTo(16f, 13.499f)
                curveTo(16f, 13.223f, 16.224f, 12.999f, 16.5f, 12.999f)
                curveTo(16.776f, 12.999f, 17f, 13.223f, 17f, 13.499f)
                lineTo(17f, 16f)
                horizontalLineTo(19.497f)
                curveTo(19.772f, 16f, 19.996f, 16.224f, 19.996f, 16.5f)
                curveTo(19.996f, 16.776f, 19.772f, 17f, 19.497f, 17f)
                horizontalLineTo(17.001f)
                close()
            }
        }.build()

        return _CloudAdd!!
    }

@Suppress("ObjectPropertyName")
private var _CloudAdd: ImageVector? = null

@Preview
@Composable
private fun CloudAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CloudAdd, contentDescription = null)
    }
}
