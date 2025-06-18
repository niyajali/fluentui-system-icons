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

public val FluentIcons.Filled.ImageMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(15.25f)
            curveTo(17.045f, 3f, 18.5f, 4.455f, 18.5f, 6.25f)
            verticalLineTo(15.25f)
            curveTo(18.5f, 15.896f, 18.311f, 16.499f, 17.986f, 17.005f)
            lineTo(12.294f, 11.629f)
            curveTo(11.427f, 10.81f, 10.071f, 10.81f, 9.204f, 11.629f)
            lineTo(3.513f, 17.004f)
            curveTo(3.188f, 16.498f, 3f, 15.896f, 3f, 15.25f)
            verticalLineTo(6.25f)
            close()
            moveTo(13.747f, 8.996f)
            curveTo(14.436f, 8.996f, 14.995f, 8.438f, 14.995f, 7.748f)
            curveTo(14.995f, 7.059f, 14.436f, 6.5f, 13.747f, 6.5f)
            curveTo(13.058f, 6.5f, 12.499f, 7.059f, 12.499f, 7.748f)
            curveTo(12.499f, 8.438f, 13.058f, 8.996f, 13.747f, 8.996f)
            close()
            moveTo(11.264f, 12.72f)
            lineTo(16.906f, 18.047f)
            curveTo(16.421f, 18.335f, 15.855f, 18.5f, 15.25f, 18.5f)
            horizontalLineTo(6.25f)
            curveTo(5.645f, 18.5f, 5.079f, 18.335f, 4.594f, 18.047f)
            lineTo(10.234f, 12.72f)
            curveTo(10.523f, 12.447f, 10.975f, 12.447f, 11.264f, 12.72f)
            close()
            moveTo(8.749f, 21f)
            curveTo(7.598f, 21f, 6.587f, 20.402f, 6.01f, 19.5f)
            horizontalLineTo(8.723f)
            lineTo(8.749f, 19.5f)
            horizontalLineTo(15.749f)
            curveTo(17.82f, 19.5f, 19.499f, 17.821f, 19.499f, 15.75f)
            verticalLineTo(6.011f)
            curveTo(20.401f, 6.589f, 20.999f, 7.6f, 20.999f, 8.75f)
            verticalLineTo(15.75f)
            curveTo(20.999f, 18.65f, 18.649f, 21f, 15.749f, 21f)
            horizontalLineTo(8.749f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ImageMultiple, contentDescription = null)
    }
}
