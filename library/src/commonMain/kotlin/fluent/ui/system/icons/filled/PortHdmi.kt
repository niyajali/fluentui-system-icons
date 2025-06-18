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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.PortHdmi: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PortHdmi",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.41f, 11.41f)
            lineTo(18.59f, 8.59f)
            curveTo(18.404f, 8.403f, 18.182f, 8.255f, 17.939f, 8.154f)
            curveTo(17.695f, 8.052f, 17.434f, 8f, 17.17f, 8f)
            horizontalLineTo(6.83f)
            curveTo(6.566f, 8f, 6.305f, 8.052f, 6.061f, 8.154f)
            curveTo(5.818f, 8.255f, 5.596f, 8.403f, 5.41f, 8.59f)
            lineTo(2.59f, 11.41f)
            curveTo(2.403f, 11.596f, 2.255f, 11.818f, 2.154f, 12.061f)
            curveTo(2.052f, 12.305f, 2f, 12.566f, 2f, 12.83f)
            verticalLineTo(14f)
            curveTo(2.002f, 14.53f, 2.213f, 15.038f, 2.588f, 15.413f)
            curveTo(2.962f, 15.787f, 3.47f, 15.998f, 4f, 16f)
            horizontalLineTo(20f)
            curveTo(20.53f, 15.998f, 21.038f, 15.787f, 21.413f, 15.413f)
            curveTo(21.787f, 15.038f, 21.998f, 14.53f, 22f, 14f)
            verticalLineTo(12.83f)
            curveTo(22f, 12.566f, 21.948f, 12.305f, 21.847f, 12.061f)
            curveTo(21.745f, 11.818f, 21.597f, 11.596f, 21.41f, 11.41f)
            verticalLineTo(11.41f)
            close()
            moveTo(17f, 12f)
            curveTo(16.999f, 12.198f, 16.919f, 12.388f, 16.779f, 12.529f)
            curveTo(16.638f, 12.669f, 16.448f, 12.749f, 16.25f, 12.75f)
            horizontalLineTo(7.75f)
            curveTo(7.551f, 12.75f, 7.36f, 12.671f, 7.22f, 12.53f)
            curveTo(7.079f, 12.39f, 7f, 12.199f, 7f, 12f)
            curveTo(7f, 11.801f, 7.079f, 11.61f, 7.22f, 11.47f)
            curveTo(7.36f, 11.329f, 7.551f, 11.25f, 7.75f, 11.25f)
            horizontalLineTo(16.25f)
            curveTo(16.448f, 11.251f, 16.638f, 11.331f, 16.779f, 11.471f)
            curveTo(16.919f, 11.612f, 16.999f, 11.802f, 17f, 12f)
            verticalLineTo(12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PortHdmiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PortHdmi, contentDescription = null)
    }
}
