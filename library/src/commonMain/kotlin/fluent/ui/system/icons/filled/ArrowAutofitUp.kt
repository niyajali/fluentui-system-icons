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

public val FluentIcons.Filled.ArrowAutofitUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowAutofitUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.952f, 5.898f)
            lineTo(13.036f, 5.8f)
            lineTo(15.391f, 3.443f)
            curveTo(15.57f, 3.17f, 15.895f, 3f, 16.251f, 3f)
            curveTo(16.574f, 3f, 16.87f, 3.139f, 17.056f, 3.368f)
            lineTo(17.061f, 3.375f)
            lineTo(17.107f, 3.439f)
            lineTo(19.465f, 5.8f)
            lineTo(19.55f, 5.898f)
            lineTo(19.555f, 5.906f)
            curveTo(19.814f, 6.254f, 19.817f, 6.731f, 19.565f, 7.083f)
            lineTo(19.559f, 7.091f)
            lineTo(19.46f, 7.208f)
            lineTo(19.354f, 7.299f)
            lineTo(19.347f, 7.305f)
            curveTo(18.998f, 7.563f, 18.521f, 7.566f, 18.17f, 7.314f)
            lineTo(18.161f, 7.308f)
            lineTo(18.052f, 7.215f)
            lineTo(17.25f, 6.413f)
            verticalLineTo(20.103f)
            lineTo(17.242f, 20.212f)
            lineTo(17.24f, 20.221f)
            curveTo(17.168f, 20.685f, 16.729f, 21f, 16.25f, 21f)
            curveTo(15.771f, 21f, 15.332f, 20.685f, 15.26f, 20.221f)
            lineTo(15.258f, 20.212f)
            lineTo(15.25f, 20.103f)
            verticalLineTo(6.414f)
            lineTo(14.451f, 7.214f)
            lineTo(14.353f, 7.299f)
            lineTo(14.345f, 7.305f)
            curveTo(13.953f, 7.595f, 13.398f, 7.563f, 13.043f, 7.208f)
            curveTo(12.688f, 6.853f, 12.656f, 6.297f, 12.946f, 5.906f)
            lineTo(12.952f, 5.898f)
            close()
            moveTo(4f, 6.492f)
            curveTo(4f, 5.111f, 5.119f, 3.992f, 6.5f, 3.992f)
            horizontalLineTo(10.5f)
            curveTo(11.052f, 3.992f, 11.5f, 4.44f, 11.5f, 4.992f)
            curveTo(11.5f, 5.544f, 11.052f, 5.992f, 10.5f, 5.992f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 5.992f, 6f, 6.216f, 6f, 6.492f)
            verticalLineTo(17.492f)
            curveTo(6f, 17.768f, 6.224f, 17.992f, 6.5f, 17.992f)
            horizontalLineTo(12.5f)
            curveTo(13.052f, 17.992f, 13.5f, 18.44f, 13.5f, 18.992f)
            curveTo(13.5f, 19.545f, 13.052f, 19.992f, 12.5f, 19.992f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 19.992f, 4f, 18.873f, 4f, 17.492f)
            verticalLineTo(6.492f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowAutofitUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowAutofitUp, contentDescription = null)
    }
}
