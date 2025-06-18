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

public val FluentIcons.Filled.Autocorrect: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Autocorrect",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.594f, 4.722f)
            curveTo(13.977f, 4.963f, 14.301f, 5.287f, 14.542f, 5.67f)
            curveTo(15.656f, 7.448f, 16.614f, 8.975f, 17.414f, 10.251f)
            lineTo(21.5f, 10.25f)
            curveTo(22.052f, 10.25f, 22.5f, 10.697f, 22.5f, 11.25f)
            curveTo(22.5f, 11.802f, 22.052f, 12.25f, 21.5f, 12.25f)
            lineTo(18.75f, 12.248f)
            curveTo(19.378f, 13.084f, 19.75f, 14.123f, 19.75f, 15.25f)
            curveTo(19.75f, 18.011f, 17.512f, 20.25f, 14.75f, 20.25f)
            curveTo(11.989f, 20.25f, 9.75f, 18.011f, 9.75f, 15.25f)
            curveTo(9.75f, 12.488f, 11.989f, 10.25f, 14.75f, 10.25f)
            lineTo(15.053f, 10.249f)
            lineTo(14.769f, 9.797f)
            curveTo(14.18f, 8.858f, 13.539f, 7.836f, 12.847f, 6.733f)
            curveTo(12.767f, 6.605f, 12.659f, 6.497f, 12.531f, 6.417f)
            curveTo(12.097f, 6.144f, 11.534f, 6.247f, 11.221f, 6.638f)
            lineTo(11.153f, 6.733f)
            lineTo(3.597f, 18.781f)
            curveTo(3.304f, 19.249f, 2.687f, 19.39f, 2.219f, 19.097f)
            curveTo(1.784f, 18.824f, 1.631f, 18.273f, 1.847f, 17.821f)
            lineTo(1.903f, 17.718f)
            lineTo(9.459f, 5.67f)
            curveTo(10.339f, 4.267f, 12.19f, 3.842f, 13.594f, 4.722f)
            close()
            moveTo(14.75f, 12.25f)
            curveTo(13.093f, 12.25f, 11.75f, 13.593f, 11.75f, 15.25f)
            curveTo(11.75f, 16.906f, 13.093f, 18.25f, 14.75f, 18.25f)
            curveTo(16.407f, 18.25f, 17.75f, 16.906f, 17.75f, 15.25f)
            curveTo(17.75f, 13.593f, 16.407f, 12.25f, 14.75f, 12.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AutocorrectPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Autocorrect, contentDescription = null)
    }
}
