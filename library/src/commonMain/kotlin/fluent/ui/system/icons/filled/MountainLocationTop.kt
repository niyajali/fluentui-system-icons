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

public val FluentIcons.Filled.MountainLocationTop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MountainLocationTop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15f, 4.343f)
            curveTo(15f, 5.465f, 13.624f, 7.46f, 12.736f, 8.631f)
            curveTo(12.361f, 9.125f, 11.639f, 9.125f, 11.264f, 8.631f)
            curveTo(10.931f, 8.192f, 10.529f, 7.637f, 10.157f, 7.056f)
            curveTo(10.104f, 6.973f, 10.052f, 6.889f, 10f, 6.805f)
            curveTo(9.449f, 5.91f, 9f, 4.984f, 9f, 4.343f)
            curveTo(9f, 2.686f, 10.343f, 1f, 12f, 1f)
            curveTo(13.657f, 1f, 15f, 2.686f, 15f, 4.343f)
            close()
            moveTo(11.129f, 5.221f)
            curveTo(11.129f, 5.221f, 11.129f, 5.221f, 11.129f, 5.221f)
            curveTo(11.374f, 5.397f, 11.675f, 5.5f, 12f, 5.5f)
            curveTo(12.325f, 5.5f, 12.626f, 5.397f, 12.871f, 5.221f)
            curveTo(12.871f, 5.221f, 12.871f, 5.221f, 12.871f, 5.221f)
            curveTo(13.252f, 4.949f, 13.5f, 4.504f, 13.5f, 4f)
            curveTo(13.5f, 3.172f, 12.828f, 2.5f, 12f, 2.5f)
            curveTo(11.172f, 2.5f, 10.5f, 3.172f, 10.5f, 4f)
            curveTo(10.5f, 4.504f, 10.748f, 4.949f, 11.129f, 5.221f)
            close()
            moveTo(6.078f, 11.823f)
            lineTo(9.759f, 8.26f)
            curveTo(9.478f, 7.854f, 9.191f, 7.414f, 8.934f, 6.971f)
            lineTo(2.99f, 12.724f)
            curveTo(2.357f, 13.337f, 2f, 14.179f, 2f, 15.06f)
            verticalLineTo(18.75f)
            curveTo(2f, 19.993f, 3.007f, 21f, 4.25f, 21f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 21f, 22f, 19.993f, 22f, 18.75f)
            verticalLineTo(15.06f)
            curveTo(22f, 14.179f, 21.643f, 13.337f, 21.01f, 12.724f)
            lineTo(15.066f, 6.971f)
            curveTo(14.809f, 7.414f, 14.522f, 7.854f, 14.241f, 8.26f)
            lineTo(16.323f, 10.274f)
            curveTo(15.611f, 10.36f, 14.939f, 10.531f, 14.302f, 10.738f)
            curveTo(13.622f, 10.96f, 12.919f, 11.25f, 12.262f, 11.52f)
            curveTo(11.875f, 11.679f, 11.503f, 11.832f, 11.162f, 11.96f)
            curveTo(10.179f, 12.331f, 9.284f, 12.573f, 8.38f, 12.543f)
            curveTo(7.669f, 12.518f, 6.913f, 12.323f, 6.078f, 11.823f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MountainLocationTopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MountainLocationTop, contentDescription = null)
    }
}
