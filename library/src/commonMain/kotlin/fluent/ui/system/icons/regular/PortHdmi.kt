/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.PortHdmi: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PortHdmi",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.414f, 11.414f)
            lineTo(18.586f, 8.586f)
            curveTo(18.211f, 8.211f, 17.702f, 8f, 17.172f, 8f)
            horizontalLineTo(6.828f)
            curveTo(6.298f, 8f, 5.789f, 8.211f, 5.414f, 8.586f)
            lineTo(2.586f, 11.414f)
            curveTo(2.4f, 11.6f, 2.253f, 11.82f, 2.152f, 12.063f)
            curveTo(2.052f, 12.306f, 2f, 12.566f, 2f, 12.828f)
            verticalLineTo(14f)
            curveTo(2f, 14.53f, 2.211f, 15.039f, 2.586f, 15.414f)
            curveTo(2.961f, 15.789f, 3.47f, 16f, 4f, 16f)
            horizontalLineTo(20f)
            curveTo(20.53f, 16f, 21.039f, 15.789f, 21.414f, 15.414f)
            curveTo(21.789f, 15.039f, 22f, 14.53f, 22f, 14f)
            verticalLineTo(12.828f)
            curveTo(22f, 12.566f, 21.948f, 12.306f, 21.848f, 12.063f)
            curveTo(21.747f, 11.82f, 21.6f, 11.6f, 21.414f, 11.414f)
            verticalLineTo(11.414f)
            close()
            moveTo(20.5f, 14f)
            curveTo(20.5f, 14.133f, 20.447f, 14.26f, 20.353f, 14.353f)
            curveTo(20.26f, 14.447f, 20.133f, 14.5f, 20f, 14.5f)
            horizontalLineTo(4f)
            curveTo(3.867f, 14.5f, 3.74f, 14.447f, 3.647f, 14.353f)
            curveTo(3.553f, 14.26f, 3.5f, 14.133f, 3.5f, 14f)
            verticalLineTo(12.828f)
            curveTo(3.5f, 12.763f, 3.513f, 12.698f, 3.538f, 12.637f)
            curveTo(3.563f, 12.576f, 3.6f, 12.521f, 3.646f, 12.475f)
            lineTo(6.475f, 9.647f)
            curveTo(6.521f, 9.6f, 6.576f, 9.563f, 6.637f, 9.538f)
            curveTo(6.698f, 9.513f, 6.763f, 9.5f, 6.828f, 9.5f)
            horizontalLineTo(17.172f)
            curveTo(17.237f, 9.5f, 17.302f, 9.513f, 17.363f, 9.538f)
            curveTo(17.424f, 9.563f, 17.479f, 9.6f, 17.525f, 9.646f)
            lineTo(20.354f, 12.475f)
            curveTo(20.4f, 12.521f, 20.437f, 12.576f, 20.462f, 12.637f)
            curveTo(20.487f, 12.698f, 20.5f, 12.763f, 20.5f, 12.828f)
            verticalLineTo(14f)
            close()
            moveTo(16.25f, 11.25f)
            horizontalLineTo(7.75f)
            curveTo(7.551f, 11.25f, 7.36f, 11.329f, 7.22f, 11.47f)
            curveTo(7.079f, 11.61f, 7f, 11.801f, 7f, 12f)
            curveTo(7f, 12.199f, 7.079f, 12.39f, 7.22f, 12.53f)
            curveTo(7.36f, 12.671f, 7.551f, 12.75f, 7.75f, 12.75f)
            horizontalLineTo(16.25f)
            curveTo(16.449f, 12.75f, 16.64f, 12.671f, 16.78f, 12.53f)
            curveTo(16.921f, 12.39f, 17f, 12.199f, 17f, 12f)
            curveTo(17f, 11.801f, 16.921f, 11.61f, 16.78f, 11.47f)
            curveTo(16.64f, 11.329f, 16.449f, 11.25f, 16.25f, 11.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PortHdmiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PortHdmi, contentDescription = null)
    }
}
