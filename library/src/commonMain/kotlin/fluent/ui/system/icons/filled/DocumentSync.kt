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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.DocumentSync: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentSync",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(20f)
            curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
            horizontalLineTo(11.19f)
            curveTo(12.311f, 20.832f, 13f, 19.247f, 13f, 17.5f)
            curveTo(13f, 13.91f, 10.09f, 11f, 6.5f, 11f)
            curveTo(5.614f, 11f, 4.77f, 11.177f, 4f, 11.498f)
            verticalLineTo(4f)
            curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
            horizontalLineTo(12f)
            close()
            moveTo(13.5f, 2.5f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(19.5f)
            lineTo(13.5f, 2.5f)
            close()
            moveTo(1f, 17.5f)
            curveTo(1f, 20.538f, 3.462f, 23f, 6.5f, 23f)
            curveTo(9.538f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 9.538f, 12f, 6.5f, 12f)
            curveTo(3.462f, 12f, 1f, 14.462f, 1f, 17.5f)
            close()
            moveTo(9.5f, 14f)
            curveTo(9.776f, 14f, 10f, 14.224f, 10f, 14.5f)
            verticalLineTo(16.5f)
            curveTo(10f, 16.776f, 9.776f, 17f, 9.5f, 17f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 17f, 7f, 16.776f, 7f, 16.5f)
            curveTo(7f, 16.224f, 7.224f, 16f, 7.5f, 16f)
            horizontalLineTo(8.5f)
            curveTo(8.044f, 15.392f, 7.317f, 15f, 6.5f, 15f)
            curveTo(5.667f, 15f, 4.928f, 15.407f, 4.473f, 16.036f)
            curveTo(4.311f, 16.26f, 3.999f, 16.31f, 3.775f, 16.148f)
            curveTo(3.551f, 15.986f, 3.501f, 15.673f, 3.663f, 15.45f)
            curveTo(4.298f, 14.572f, 5.332f, 14f, 6.5f, 14f)
            curveTo(7.48f, 14f, 8.365f, 14.403f, 9f, 15.051f)
            verticalLineTo(14.5f)
            curveTo(9f, 14.224f, 9.224f, 14f, 9.5f, 14f)
            close()
            moveTo(4f, 19.949f)
            verticalLineTo(20.5f)
            curveTo(4f, 20.776f, 3.776f, 21f, 3.5f, 21f)
            curveTo(3.224f, 21f, 3f, 20.776f, 3f, 20.5f)
            verticalLineTo(18.5f)
            curveTo(3f, 18.224f, 3.224f, 18f, 3.5f, 18f)
            horizontalLineTo(5.5f)
            curveTo(5.776f, 18f, 6f, 18.224f, 6f, 18.5f)
            curveTo(6f, 18.776f, 5.776f, 19f, 5.5f, 19f)
            horizontalLineTo(4.5f)
            curveTo(4.956f, 19.608f, 5.683f, 20f, 6.5f, 20f)
            curveTo(7.266f, 20f, 7.952f, 19.656f, 8.411f, 19.112f)
            curveTo(8.589f, 18.901f, 8.905f, 18.874f, 9.116f, 19.052f)
            curveTo(9.327f, 19.23f, 9.353f, 19.546f, 9.175f, 19.757f)
            curveTo(8.534f, 20.516f, 7.573f, 21f, 6.5f, 21f)
            curveTo(5.52f, 21f, 4.635f, 20.597f, 4f, 19.949f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentSync, contentDescription = null)
    }
}
