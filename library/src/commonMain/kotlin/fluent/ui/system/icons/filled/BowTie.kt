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

public val FluentIcons.Filled.BowTie: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BowTie",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 5.766f)
            curveTo(2f, 3.846f, 4.074f, 2.643f, 5.74f, 3.595f)
            lineTo(9.24f, 5.595f)
            curveTo(9.419f, 5.697f, 9.582f, 5.819f, 9.727f, 5.958f)
            curveTo(10.073f, 5.672f, 10.516f, 5.5f, 11f, 5.5f)
            horizontalLineTo(13f)
            curveTo(13.484f, 5.5f, 13.927f, 5.672f, 14.273f, 5.958f)
            curveTo(14.418f, 5.819f, 14.581f, 5.697f, 14.76f, 5.595f)
            lineTo(18.26f, 3.595f)
            curveTo(19.926f, 2.643f, 22f, 3.846f, 22f, 5.766f)
            verticalLineTo(11.716f)
            curveTo(22f, 13.632f, 19.933f, 14.836f, 18.267f, 13.891f)
            lineTo(14.767f, 11.905f)
            curveTo(14.463f, 11.733f, 14.204f, 11.502f, 14.001f, 11.232f)
            curveTo(13.707f, 11.402f, 13.365f, 11.5f, 13f, 11.5f)
            horizontalLineTo(11f)
            curveTo(10.635f, 11.5f, 10.293f, 11.402f, 9.999f, 11.232f)
            curveTo(9.796f, 11.502f, 9.537f, 11.733f, 9.234f, 11.905f)
            lineTo(5.734f, 13.891f)
            curveTo(4.067f, 14.836f, 2f, 13.632f, 2f, 11.716f)
            verticalLineTo(5.766f)
            close()
            moveTo(8f, 8f)
            curveTo(7.586f, 8f, 7.25f, 8.336f, 7.25f, 8.75f)
            curveTo(7.25f, 9.164f, 7.586f, 9.5f, 8f, 9.5f)
            horizontalLineTo(9.75f)
            verticalLineTo(8f)
            horizontalLineTo(8f)
            close()
            moveTo(16.75f, 8.75f)
            curveTo(16.75f, 8.336f, 16.414f, 8f, 16f, 8f)
            horizontalLineTo(14.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(16f)
            curveTo(16.414f, 9.5f, 16.75f, 9.164f, 16.75f, 8.75f)
            close()
            moveTo(9.727f, 12.775f)
            curveTo(9.916f, 12.668f, 10.093f, 12.544f, 10.255f, 12.407f)
            curveTo(10.53f, 12.477f, 10.75f, 12.708f, 10.75f, 12.991f)
            verticalLineTo(19.25f)
            curveTo(10.75f, 20.216f, 9.966f, 21f, 9f, 21f)
            horizontalLineTo(6.589f)
            curveTo(5.419f, 21f, 4.579f, 19.875f, 4.911f, 18.753f)
            lineTo(6.069f, 14.845f)
            curveTo(6.122f, 14.818f, 6.174f, 14.79f, 6.227f, 14.76f)
            lineTo(9.727f, 12.775f)
            close()
            moveTo(13.744f, 12.407f)
            curveTo(13.469f, 12.477f, 13.25f, 12.708f, 13.25f, 12.991f)
            verticalLineTo(19.25f)
            curveTo(13.25f, 20.216f, 14.033f, 21f, 15f, 21f)
            horizontalLineTo(17.411f)
            curveTo(18.58f, 21f, 19.421f, 19.874f, 19.089f, 18.753f)
            lineTo(17.931f, 14.845f)
            curveTo(17.878f, 14.818f, 17.825f, 14.79f, 17.773f, 14.76f)
            lineTo(14.273f, 12.775f)
            curveTo(14.084f, 12.668f, 13.907f, 12.544f, 13.744f, 12.407f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BowTiePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BowTie, contentDescription = null)
    }
}
