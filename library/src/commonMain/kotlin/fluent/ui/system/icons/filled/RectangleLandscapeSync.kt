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

public val FluentUi.Filled.RectangleLandscapeSync: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RectangleLandscapeSync",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineTo(11.81f)
            curveTo(20.832f, 10.689f, 19.247f, 10f, 17.5f, 10f)
            curveTo(13.91f, 10f, 11f, 12.91f, 11f, 16.5f)
            curveTo(11f, 17.789f, 11.375f, 18.99f, 12.022f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(12f, 16.5f)
            curveTo(12f, 19.538f, 14.462f, 22f, 17.5f, 22f)
            curveTo(20.538f, 22f, 23f, 19.538f, 23f, 16.5f)
            curveTo(23f, 13.462f, 20.538f, 11f, 17.5f, 11f)
            curveTo(14.462f, 11f, 12f, 13.462f, 12f, 16.5f)
            close()
            moveTo(20.5f, 13f)
            curveTo(20.776f, 13f, 21f, 13.224f, 21f, 13.5f)
            verticalLineTo(15.5f)
            curveTo(21f, 15.776f, 20.776f, 16f, 20.5f, 16f)
            horizontalLineTo(18.5f)
            curveTo(18.224f, 16f, 18f, 15.776f, 18f, 15.5f)
            curveTo(18f, 15.224f, 18.224f, 15f, 18.5f, 15f)
            horizontalLineTo(19.5f)
            curveTo(19.044f, 14.392f, 18.317f, 14f, 17.5f, 14f)
            curveTo(16.667f, 14f, 15.928f, 14.407f, 15.473f, 15.036f)
            curveTo(15.311f, 15.26f, 14.999f, 15.31f, 14.775f, 15.148f)
            curveTo(14.551f, 14.986f, 14.501f, 14.673f, 14.663f, 14.45f)
            curveTo(15.298f, 13.572f, 16.332f, 13f, 17.5f, 13f)
            curveTo(18.48f, 13f, 19.365f, 13.403f, 20f, 14.051f)
            verticalLineTo(13.5f)
            curveTo(20f, 13.224f, 20.224f, 13f, 20.5f, 13f)
            close()
            moveTo(15f, 18.949f)
            verticalLineTo(19.5f)
            curveTo(15f, 19.776f, 14.776f, 20f, 14.5f, 20f)
            curveTo(14.224f, 20f, 14f, 19.776f, 14f, 19.5f)
            verticalLineTo(17.5f)
            curveTo(14f, 17.224f, 14.224f, 17f, 14.5f, 17f)
            horizontalLineTo(16.5f)
            curveTo(16.776f, 17f, 17f, 17.224f, 17f, 17.5f)
            curveTo(17f, 17.776f, 16.776f, 18f, 16.5f, 18f)
            horizontalLineTo(15.5f)
            curveTo(15.956f, 18.608f, 16.683f, 19f, 17.5f, 19f)
            curveTo(18.266f, 19f, 18.952f, 18.656f, 19.411f, 18.112f)
            curveTo(19.589f, 17.901f, 19.905f, 17.874f, 20.116f, 18.052f)
            curveTo(20.327f, 18.23f, 20.353f, 18.546f, 20.175f, 18.757f)
            curveTo(19.534f, 19.516f, 18.573f, 20f, 17.5f, 20f)
            curveTo(16.52f, 20f, 15.635f, 19.597f, 15f, 18.949f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RectangleLandscapeSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.RectangleLandscapeSync, contentDescription = null)
    }
}
