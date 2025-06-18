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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.FilterSync: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FilterSync",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 7.5f)
            curveTo(12f, 10.538f, 14.462f, 13f, 17.5f, 13f)
            curveTo(20.538f, 13f, 23f, 10.538f, 23f, 7.5f)
            curveTo(23f, 4.462f, 20.538f, 2f, 17.5f, 2f)
            curveTo(14.462f, 2f, 12f, 4.462f, 12f, 7.5f)
            close()
            moveTo(20.5f, 4f)
            curveTo(20.776f, 4f, 21f, 4.224f, 21f, 4.5f)
            verticalLineTo(6.5f)
            curveTo(21f, 6.776f, 20.776f, 7f, 20.5f, 7f)
            horizontalLineTo(18.5f)
            curveTo(18.224f, 7f, 18f, 6.776f, 18f, 6.5f)
            curveTo(18f, 6.224f, 18.224f, 6f, 18.5f, 6f)
            horizontalLineTo(19.5f)
            curveTo(19.044f, 5.392f, 18.317f, 5f, 17.5f, 5f)
            curveTo(16.667f, 5f, 15.928f, 5.407f, 15.473f, 6.036f)
            curveTo(15.311f, 6.26f, 14.999f, 6.31f, 14.775f, 6.148f)
            curveTo(14.551f, 5.986f, 14.501f, 5.673f, 14.663f, 5.45f)
            curveTo(15.298f, 4.572f, 16.332f, 4f, 17.5f, 4f)
            curveTo(18.48f, 4f, 19.365f, 4.403f, 20f, 5.051f)
            verticalLineTo(4.5f)
            curveTo(20f, 4.224f, 20.224f, 4f, 20.5f, 4f)
            close()
            moveTo(15f, 9.949f)
            verticalLineTo(10.5f)
            curveTo(15f, 10.776f, 14.776f, 11f, 14.5f, 11f)
            curveTo(14.224f, 11f, 14f, 10.776f, 14f, 10.5f)
            verticalLineTo(8.5f)
            curveTo(14f, 8.224f, 14.224f, 8f, 14.5f, 8f)
            horizontalLineTo(16.5f)
            curveTo(16.776f, 8f, 17f, 8.224f, 17f, 8.5f)
            curveTo(17f, 8.776f, 16.776f, 9f, 16.5f, 9f)
            horizontalLineTo(15.5f)
            curveTo(15.956f, 9.608f, 16.683f, 10f, 17.5f, 10f)
            curveTo(18.266f, 10f, 18.952f, 9.656f, 19.411f, 9.112f)
            curveTo(19.589f, 8.901f, 19.905f, 8.874f, 20.116f, 9.052f)
            curveTo(20.327f, 9.231f, 20.353f, 9.546f, 20.175f, 9.757f)
            curveTo(19.534f, 10.516f, 18.573f, 11f, 17.5f, 11f)
            curveTo(16.52f, 11f, 15.635f, 10.597f, 15f, 9.949f)
            close()
            moveTo(7.5f, 12.5f)
            horizontalLineTo(13.346f)
            curveTo(12.832f, 12.072f, 12.384f, 11.566f, 12.022f, 11f)
            horizontalLineTo(7.5f)
            curveTo(7.086f, 11f, 6.75f, 11.336f, 6.75f, 11.75f)
            curveTo(6.75f, 12.164f, 7.086f, 12.5f, 7.5f, 12.5f)
            close()
            moveTo(11f, 7.5f)
            curveTo(11f, 6.984f, 11.06f, 6.482f, 11.174f, 6f)
            horizontalLineTo(4.5f)
            curveTo(4.086f, 6f, 3.75f, 6.336f, 3.75f, 6.75f)
            curveTo(3.75f, 7.164f, 4.086f, 7.5f, 4.5f, 7.5f)
            horizontalLineTo(11f)
            close()
            moveTo(13.5f, 16f)
            curveTo(13.914f, 16f, 14.25f, 16.336f, 14.25f, 16.75f)
            curveTo(14.25f, 17.164f, 13.914f, 17.5f, 13.5f, 17.5f)
            horizontalLineTo(10.5f)
            curveTo(10.086f, 17.5f, 9.75f, 17.164f, 9.75f, 16.75f)
            curveTo(9.75f, 16.336f, 10.086f, 16f, 10.5f, 16f)
            horizontalLineTo(13.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FilterSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FilterSync, contentDescription = null)
    }
}
