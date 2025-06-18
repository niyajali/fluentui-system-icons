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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.LightbulbCircle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LightbulbCircle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(14.481f, 17f)
            horizontalLineTo(9.519f)
            lineTo(9.622f, 17.454f)
            lineTo(9.665f, 17.606f)
            lineTo(9.722f, 17.749f)
            curveTo(10.01f, 18.395f, 10.624f, 18.798f, 11.309f, 18.798f)
            horizontalLineTo(12.691f)
            lineTo(12.847f, 18.79f)
            lineTo(12.998f, 18.767f)
            lineTo(13.144f, 18.732f)
            curveTo(13.766f, 18.558f, 14.234f, 18.076f, 14.377f, 17.456f)
            lineTo(14.481f, 17f)
            close()
            moveTo(12f, 5.202f)
            curveTo(9.239f, 5.202f, 7f, 7.44f, 7f, 10.202f)
            lineTo(7.008f, 10.473f)
            lineTo(7.029f, 10.729f)
            lineTo(7.062f, 10.981f)
            curveTo(7.248f, 12.149f, 7.831f, 13.196f, 8.701f, 13.959f)
            lineTo(8.856f, 14.088f)
            lineTo(9.177f, 15.5f)
            horizontalLineTo(14.821f)
            lineTo(15.141f, 14.09f)
            lineTo(15.304f, 13.953f)
            curveTo(16.314f, 13.059f, 16.925f, 11.81f, 16.994f, 10.457f)
            lineTo(17f, 10.202f)
            curveTo(17f, 7.44f, 14.761f, 5.202f, 12f, 5.202f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LightbulbCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LightbulbCircle, contentDescription = null)
    }
}
