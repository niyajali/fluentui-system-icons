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

public val FluentIcons.Filled.PersonSync: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonSync",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 7f)
            curveTo(12f, 9.209f, 10.209f, 11f, 8f, 11f)
            curveTo(5.791f, 11f, 4f, 9.209f, 4f, 7f)
            curveTo(4f, 4.791f, 5.791f, 3f, 8f, 3f)
            curveTo(10.209f, 3f, 12f, 4.791f, 12f, 7f)
            close()
            moveTo(20f, 8f)
            curveTo(20f, 9.657f, 18.657f, 11f, 17f, 11f)
            curveTo(15.343f, 11f, 14f, 9.657f, 14f, 8f)
            curveTo(14f, 6.343f, 15.343f, 5f, 17f, 5f)
            curveTo(18.657f, 5f, 20f, 6.343f, 20f, 8f)
            close()
            moveTo(2f, 15.25f)
            curveTo(2f, 14.007f, 3.007f, 13f, 4.25f, 13f)
            horizontalLineTo(11.75f)
            curveTo(12.066f, 13f, 12.367f, 13.065f, 12.641f, 13.183f)
            curveTo(11.62f, 14.331f, 11f, 15.843f, 11f, 17.5f)
            curveTo(11f, 18.156f, 11.097f, 18.79f, 11.278f, 19.388f)
            curveTo(10.458f, 19.758f, 9.39f, 20f, 8f, 20f)
            curveTo(2f, 20f, 2f, 15.5f, 2f, 15.5f)
            verticalLineTo(15.25f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            close()
            moveTo(20.5f, 14f)
            curveTo(20.776f, 14f, 21f, 14.224f, 21f, 14.5f)
            verticalLineTo(16.5f)
            curveTo(21f, 16.776f, 20.776f, 17f, 20.5f, 17f)
            horizontalLineTo(18.5f)
            curveTo(18.224f, 17f, 18f, 16.776f, 18f, 16.5f)
            curveTo(18f, 16.224f, 18.224f, 16f, 18.5f, 16f)
            horizontalLineTo(19.5f)
            curveTo(19.044f, 15.392f, 18.317f, 15f, 17.5f, 15f)
            curveTo(16.667f, 15f, 15.928f, 15.407f, 15.473f, 16.036f)
            curveTo(15.311f, 16.26f, 14.999f, 16.31f, 14.775f, 16.148f)
            curveTo(14.551f, 15.986f, 14.501f, 15.673f, 14.663f, 15.45f)
            curveTo(15.298f, 14.572f, 16.332f, 14f, 17.5f, 14f)
            curveTo(18.48f, 14f, 19.365f, 14.403f, 20f, 15.051f)
            verticalLineTo(14.5f)
            curveTo(20f, 14.224f, 20.224f, 14f, 20.5f, 14f)
            close()
            moveTo(15f, 19.949f)
            verticalLineTo(20.5f)
            curveTo(15f, 20.776f, 14.776f, 21f, 14.5f, 21f)
            curveTo(14.224f, 21f, 14f, 20.776f, 14f, 20.5f)
            verticalLineTo(18.5f)
            curveTo(14f, 18.224f, 14.224f, 18f, 14.5f, 18f)
            horizontalLineTo(16.5f)
            curveTo(16.776f, 18f, 17f, 18.224f, 17f, 18.5f)
            curveTo(17f, 18.776f, 16.776f, 19f, 16.5f, 19f)
            horizontalLineTo(15.5f)
            curveTo(15.956f, 19.608f, 16.683f, 20f, 17.5f, 20f)
            curveTo(18.266f, 20f, 18.952f, 19.656f, 19.411f, 19.112f)
            curveTo(19.589f, 18.901f, 19.905f, 18.874f, 20.116f, 19.052f)
            curveTo(20.327f, 19.23f, 20.353f, 19.546f, 20.175f, 19.757f)
            curveTo(19.534f, 20.516f, 18.573f, 21f, 17.5f, 21f)
            curveTo(16.52f, 21f, 15.635f, 20.597f, 15f, 19.949f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonSync, contentDescription = null)
    }
}
